package com.example.viajesDT.service;

import com.example.viajesDT.adapter.PasajeroAdapter;
import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.entity.Pasajero;

public interface IPasajeroService {


    //Agregar un pasajero al sistema
    PasajeroDTO createPasajero (PasajeroDTO pas);

    PasajeroDTO findById(Long id);
}
