package com.example.viajesDT.service;


import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.repository.IViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeService implements IViajeService{

    @Autowired
    private ViajeAdapter viajeAdapter;

    @Autowired
    private IVehiculoService vehiculoSer;


    @Override
    public ViajeDTO crearViaje(ViajeDTO viajeDTO) {

      VehiculoDTO vehiculoDTO =  vehiculoSer.findById(viajeDTO.getVehiculo().getIdVehiculo());

      validateVehiculo(vehiculoDTO);

      viajeDTO.setVehiculo(vehiculoDTO);
       return viajeAdapter.save(viajeDTO);
    }

    private void validateVehiculo(VehiculoDTO vehiculoDTO) {
        //todo Validaciones
    }

    @Override
    public ViajeDTO findById(Long id) {

        return viajeAdapter.findById(id);

    }

    /*public ViajeDTO findViajeByChoferId(Long idChofer){

    }*/
}
