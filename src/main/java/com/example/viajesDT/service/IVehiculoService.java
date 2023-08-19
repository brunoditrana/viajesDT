package com.example.viajesDT.service;

import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.response.VehiculoResponse;

public interface IVehiculoService {


    VehiculoDTO createVehiculo(VehiculoDTO veh);

    VehiculoDTO findById(Long id);
}
