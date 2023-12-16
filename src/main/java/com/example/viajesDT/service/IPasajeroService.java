package com.example.viajesDT.service;

import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.request.ViajePasajeroRequest;

public interface IPasajeroService {


    //Agregar un pasajero al sistema
    PasajeroDTO createPasajero (PasajeroDTO pas);

    PasajeroDTO findById(Long id);

    PasajeroDTO findByDni(Integer dni);

    void pasajeroAUnViaje(ViajePasajeroRequest requets);
}
