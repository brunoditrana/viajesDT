package com.example.viajesDT.service;


import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.dto.ViajeRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViajeService implements IViajeService{

    @Autowired
    private ViajeAdapter viajeAdapter;

    @Autowired
    private IVehiculoService vehiculoSer;

    @Autowired
    private IChoferService choferService;

    @Override
    public ViajeDTO crearViaje(ViajeRequestDTO viajeRequestDTO) {

    ViajeDTO viajeDTONuevo = new ViajeDTO();

        //todo Vehiculo
      VehiculoDTO vehiculoDTO =  vehiculoSer.findById(viajeRequestDTO.getIdVehiculo());
      validateVehiculo(vehiculoDTO);
        viajeDTONuevo.setVehiculo(vehiculoDTO);


      /*
      Obtengo los ID de los choferes que se enceuntran en viajeDTO.getLista_choferes()
         Y los guardo en listaChoferesId
      List<Long> listaChoferesId = new ArrayList<>();
        for (ChoferDTO choferDTO : viajeRequest.getListaChoferes()){
             listaChoferesId.add(choferDTO.getIdChofer());
        }

        ChoferDTO choferDTO = choferService.findByAllId(viajeRequestDTO.getListaChoferes());
        validateChofer(choferDTO);

         Creo una nueva lista donde voy a guardar los choferes
        List<ChoferDTO> choferes = new ArrayList<>();
        for (Long choferId : viajeRequestDTO.getListaChoferes()){
            ChoferDTO choferDTOs = choferService.findByAllId(viajeRequestDTO.getListaChoferes());
            validateChofer(choferDTO); //Lo valido
            choferes.add(choferDTO);    //Lo guardo en la lista creada anteriormente
        }*/
        //Seteo los choferes encontrados anteriormente a setLista_choferes

        List<ChoferDTO> choferes = new ArrayList<>();
        for (Long choferId : viajeRequestDTO.getListaChoferes()) {
            ChoferDTO choferDTO = choferService.findById(choferId);
            validateChofer(choferDTO);
            choferes.add(choferDTO);
        }

        //todo Choferes
       // ChoferDTO choferDTO = choferService.findByAllId(viajeRequestDTO.getListaChoferes());
        //validateChofer(choferDTO);
        //List<ChoferDTO> choferes = new ArrayList<>();
        //viajeDTONuevo.setListaChoferes(choferes);

        viajeDTONuevo.setDestino(viajeRequestDTO.getDestino());
        viajeDTONuevo.setFechaSalida(viajeRequestDTO.getFechaSalida());
        viajeDTONuevo.setFechaLlegada(viajeRequestDTO.getFechaLlegada());
        viajeDTONuevo.setPrecio(viajeRequestDTO.getPrecio());
        viajeDTONuevo.setListaChoferes(choferes);

       return viajeAdapter.save(viajeDTONuevo);
    }

    private void validateVehiculo(VehiculoDTO vehiculoDTO) {

        //VAlidar por estado

        if (vehiculoDTO == null) {
            throw new IllegalArgumentException("El vehículo no existe.");
        }
    }
    private void validateChofer(ChoferDTO choferDTO) {

        //Validar qu este disponible
        if (choferDTO == null) {
            throw new IllegalArgumentException("El chofer no existe.");
        }
    }
    @Override
    public ViajeDTO findById(Long id) {

        return viajeAdapter.findById(id);

    }



    public ViajeChoferDTO findViajeByIdChofer(Long idChofer){

        return viajeAdapter.findViajeByIdChofer(idChofer);
    }
}
