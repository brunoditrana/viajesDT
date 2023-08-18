package com.example.viajesDT.service;


import com.example.viajesDT.adapter.PasajeroAdapter;
import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.entity.Pasajero;
import com.example.viajesDT.repository.IPasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasajeroService implements IPasajeroService{


    @Autowired
    private PasajeroAdapter pasajeroAdapter;



    @Override
    public PasajeroDTO createPasajero(PasajeroDTO pas) {

        return pasajeroAdapter.save(pas);
    }
}
