package com.example.viajesDT.service;


import com.example.viajesDT.entity.Pasajero;
import com.example.viajesDT.repository.IPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasajeroService implements IPasajeroService{


    @Autowired
    private IPasajero pasajeRepo;


    //Agregar un pasajero al sistema
    @Override
    public void createPasajero(Pasajero pas) {
        this.pasajeRepo.save(pas);
    }

}
