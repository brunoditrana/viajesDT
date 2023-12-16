package com.example.viajesDT.service;

import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.dto.ViajeRequestDTO;

import java.util.List;

public interface IViajeService {


    ViajeDTO crearViaje(ViajeRequestDTO viajeRequest);

    ViajeDTO findById(Long id);

    List<ViajeDTO> findAllViajesPendientes();
}
