package com.example.viajesDT.adapter;

import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.dto.ViajeDTO;

import java.util.List;

public interface ViajeAdapter {

    ViajeDTO save(ViajeDTO viajeDTO);

    ViajeDTO findById(Long id);

    List<ViajeChoferDTO> findViajeByIdChofer(Long id);

    List<ViajeDTO> findAllViajesPendientes();
}
