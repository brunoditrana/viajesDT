package com.example.viajesDT.service;


import com.example.viajesDT.adapter.ChoferAdapter;
import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.adapter.ViajeChoferAdapter;
import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.dto.ViajeDTO;
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

    @Override
    public ChoferDTO createChofer(ChoferDTO chof) {
      return this.choferAdap.save(chof);

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
}
