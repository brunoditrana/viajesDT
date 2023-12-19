package com.example.viajesDT.service;


import com.example.viajesDT.adapter.*;
import com.example.viajesDT.dto.*;
import com.example.viajesDT.dto.response.DeudaAChoferesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ChoferService implements IChoferService{

    @Autowired
    private ChoferAdapter choferAdap;

    @Autowired
    private ViajeAdapter viajeAdapter;


    @Autowired
    private ViajeChoferAdapter viajeChoferAdap;

    @Autowired
    private ViajePasajeroAdapter viajePasajeroAdap ;

    @Autowired
    private ConfSueldoChoferAdapter confSueldoAdapter;


    @Override
    public ChoferDTO createChofer(ChoferDTO chof) {
        //todo generar metoo para setearla fecha
       auditoria(chof);
      return this.choferAdap.save(chof);

    }
    public void auditoria(ChoferDTO chofer){

        Date now = new Date();
        chofer.setFechaModificacion(now);
        chofer.setFechaCreacion(now);
    }

    @Override
    public ChoferDTO findById(Long id) {


        ChoferDTO choferDTO = choferAdap.findById(id);

        List<Long> viajesAsignados = new ArrayList<>();
        List<Long> viajesRealizados = new ArrayList<>();

        List<ViajeChoferDTO> listaDeViajeChofer = viajeChoferAdap.findByChoferId(id);

        for (ViajeChoferDTO viajeChoferDTO : listaDeViajeChofer) {

            ViajeDTO viajeDTO =viajeAdapter.findById(viajeChoferDTO.getIdViaje());

            if ( viajeDTO != null){
                if (viajeDTO.getFechaSalida().after(new Date())){

                    viajesAsignados.add(viajeDTO.getIdViaje());
                }else {

                    viajesRealizados.add(viajeDTO.getIdViaje());
                }
            } else {
                throw new RuntimeException("ViajeDTO es null");
            }
        }
        choferDTO.setViajesAsignados(viajesAsignados);
        choferDTO.setViajesRealizados(viajesRealizados);

        return choferDTO;

        //consulto la tabla viajeChofer
        //para la lista de viajes, obtener id del viaje
        //para cada id, consulto el viaje
        //para cada viaje veo si la fecha de salida es posterio o anterior a hoy y lo guardo en dos listas
        //la lista viajesRealizados la seteo en el DTO en el campo ViajesRealizados
        //la lista viajesAsignados la seteo en el DTO en el campo ViajesAsignados

 //       choferDTO.setViajesRealizados();
 //       choferDTO.setViajes_asignados();

    }

    @Override
    public ChoferDTO findByAllId(List<Long> id) {

        return null;
    }



    @Override
    public List<DeudaAChoferesResponse>  deudaAChoferes() {

        List<ViajeChoferDTO> viajeChoferDTO = viajeChoferAdap.findAllViajeChofer();

        List<DeudaAChoferesResponse> listaDeuda = new ArrayList<>();



        for (ViajeChoferDTO viaje: viajeChoferDTO) {
            if (!viaje.getPagado()){

                ViajeDTO viajeDTO = viajeAdapter.findById(viaje.getIdViaje());
                DeudaAChoferesResponse deuda = new DeudaAChoferesResponse();

                deuda.setIdViaje(viaje.getIdViaje());
                deuda.setIdChofer(viaje.getIdChofer());
                deuda.setPrecio(viajeDTO.getPrecio());

                listaDeuda.add(deuda);
            }
        }

        return listaDeuda;
    }

    @Override
    public ChoferDTO findByDni(Integer id) {
        return null;
    }


    //Pagarle a un chofer
    @Override
    public void pagarleAUnChofer(Integer dni) {

       ChoferDTO choferDTO = choferAdap.findByDni(dni);

        if (choferDTO == null) {
            throw new RuntimeException("No se encontro el chofer en la base de datos");
        }

        List<ViajeChoferDTO> list = viajeChoferAdap.findByChoferId(choferDTO.getIdChofer());

        for (ViajeChoferDTO viajeChofer: list) {

            int cantidad;
            double precio, total, sueldoChofer;
            if (viajeChofer.getPagado().equals(false)){

              ViajePasajeroDTO viajePasajeroDTO = viajePasajeroAdap.findById(viajeChofer.getIdViaje());

              ViajeDTO viajeDTO = viajeAdapter.findById(viajePasajeroDTO.getIdViaje());

              List<PasajeroDTO> listaPasajeros = viajeDTO.getListaPasajeros();

                cantidad = listaPasajeros.size();

               precio = viajeDTO.getPrecio();

               total = precio * cantidad;

                ConfSueldoChoferDTO confSueldoDTO = confSueldoAdapter.findByChoferId(choferDTO.getIdChofer());

                sueldoChofer = confSueldoDTO.getPorcentaje() * total / 100;

                viajeChofer.setPagado(true);


            }
        }

    }
}
