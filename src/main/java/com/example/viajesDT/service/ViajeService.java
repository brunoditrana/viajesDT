package com.example.viajesDT.service;


import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.repository.IViajeRepository;
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
    public ViajeDTO crearViaje(ViajeDTO viajeDTO) {


        //todo Vehiculo
      VehiculoDTO vehiculoDTO =  vehiculoSer.findById(viajeDTO.getVehiculo().getIdVehiculo());
      validateVehiculo(vehiculoDTO);
      viajeDTO.setVehiculo(vehiculoDTO);


        //todo Choferes
      //Obtengo los ID de los choferes que se enceuntran en viajeDTO.getLista_choferes()
        // Y los guardo en listaChoferesId
      List<Long> listaChoferesId = new ArrayList<>();
        for (ChoferDTO choferDTO : viajeDTO.getListaChoferes()){
              listaChoferesId.add(choferDTO.getIdChofer());
        }

        // Creo una nueva lista donde voy a guardar los choferes
    List<ChoferDTO> choferes = new ArrayList<>();
        for (Long choferId : listaChoferesId){
            ChoferDTO choferDTO = choferService.findById(choferId);
            validateChofer(choferDTO); //Lo valido
            choferes.add(choferDTO);    //Lo guardo en la lista creada anteriormente
        }
        //Seteo los choferes encontrados anteriormente a setLista_choferes
        viajeDTO.setListaChoferes(choferes);

       return viajeAdapter.save(viajeDTO);
    }

    private void validateVehiculo(VehiculoDTO vehiculoDTO) {

        if (vehiculoDTO == null) {
            throw new IllegalArgumentException("El vehículo no existe.");
        }
    }
    private void validateChofer(ChoferDTO choferDTO) {

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
