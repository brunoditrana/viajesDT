package com.example.viajesDT.adapter;

import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.request.ViajePasajeroRequest;

public interface PasajeroAdapter {


    PasajeroDTO save(PasajeroDTO pasajeroDTO);

    PasajeroDTO findById(Long id);

    PasajeroDTO findByDni(Integer dni);

     void pasajeroAUnViaje(ViajePasajeroRequest requets);
}
