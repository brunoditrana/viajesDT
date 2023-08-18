package com.example.viajesDT.service;


import com.example.viajesDT.entity.Vehiculo;
import com.example.viajesDT.repository.IVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService implements IVehiculoService{

    @Autowired
    private IVehiculoRepository vehiculoRepo;

    @Override
    public void createVehiculo(Vehiculo veh) {
        this.vehiculoRepo.save(veh);

    }
}

