package com.example.viajesDT.adapter;

import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.PasajeroDTO;

public interface PasajeroAdapter {


    PasajeroDTO save(PasajeroDTO pasajeroDTO);

    PasajeroDTO findById(Long id);
}
