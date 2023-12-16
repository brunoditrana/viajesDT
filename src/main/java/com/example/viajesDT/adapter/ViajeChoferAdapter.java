package com.example.viajesDT.adapter;

import com.example.viajesDT.dto.ViajeChoferDTO;

import java.util.List;

public interface ViajeChoferAdapter {

    ViajeChoferDTO findById(Long id );
    List<ViajeChoferDTO> findByChoferId(Long choferId);

    List<ViajeChoferDTO> findAllViajeChofer();
}
