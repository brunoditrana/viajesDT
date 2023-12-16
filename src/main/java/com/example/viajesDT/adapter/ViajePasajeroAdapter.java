package com.example.viajesDT.adapter;


import com.example.viajesDT.dto.ViajePasajeroDTO;

import java.util.List;

public interface ViajePasajeroAdapter {

    ViajePasajeroDTO findById(Long id);


    List<ViajePasajeroDTO> findByViajeId(Long id);
}
