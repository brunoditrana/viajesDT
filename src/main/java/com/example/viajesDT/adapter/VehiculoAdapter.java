package com.example.viajesDT.adapter;

import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.response.VehiculoGetResponse;

public interface VehiculoAdapter {

    VehiculoDTO save(VehiculoDTO vehiculoDTO);

    VehiculoDTO findById(Long id);
}
