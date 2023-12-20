package com.example.viajesDT.service;


import com.example.viajesDT.adapter.VehiculoAdapter;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.request.VehiculoRequest;
import com.example.viajesDT.dto.response.VehiculoGetResponse;
import com.example.viajesDT.dto.response.VehiculoResponse;
import com.example.viajesDT.mapper.VehiculoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService implements IVehiculoService{

    @Autowired
    private VehiculoAdapter vehiculoAdapter;



    @Override
    public VehiculoDTO createVehiculo(VehiculoDTO veh) {

        return vehiculoAdapter.save(veh);
    }

    @Override
    public VehiculoDTO findById(Long id) {

        return vehiculoAdapter.findById(id);

    }

    @Override
    public void editVehiculo(VehiculoRequest request) {

        VehiculoDTO vehiculo = vehiculoAdapter.findById(request.getIdVehiculo());

        vehiculo.setTipoVehiculo(request.getTipoVehiculo());
        vehiculo.setCapacidad(request.getCapacidad());
        vehiculo.setEstado(request.getEstado());
        vehiculo.setModelo(request.getModelo());
        vehiculo.setPatente(request.getPatente());
        vehiculo.setKmRecorridos(request.getKmRecorridos());

        vehiculoAdapter.save(vehiculo);
    }

    @Override
    public void deleteVehiculo(Long id) {
        vehiculoAdapter.deleteVehiculo(id);
    }


}

