package com.example.viajesDT.service;


import com.example.viajesDT.model.Vehiculo;
import com.example.viajesDT.repository.IVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService implements IVehiculoService{

    @Autowired
    private IVehiculo vehiculoRepo;

    @Override
    public void createVehiculo(Vehiculo veh) {
        this.vehiculoRepo.save(veh);

    }
}

