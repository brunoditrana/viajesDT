package com.example.viajesDT.service;


import com.example.viajesDT.adapter.VehiculoAdapter;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.entity.Vehiculo;
import com.example.viajesDT.repository.IVehiculoRepository;
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
}

