package com.example.viajesDT.controller;

import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.dto.response.ViajeChoferResponse;
import com.example.viajesDT.entity.ViajeChofer;
import com.example.viajesDT.mapper.ViajeMapper;
import com.example.viajesDT.repository.IViajeChoferRepository;
import com.example.viajesDT.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping(path = "viajesDT/viajeChofer")
@RestController
public class ViajeChoferController {

    @Autowired
    private IViajeChoferRepository viajeChoferRepos;

    @GetMapping("/{id}")
    public ViajeChoferResponse findViajeByIdChofer(@PathVariable Long id){

        Optional<ViajeChofer> viajeChoferDTO = viajeChoferRepos.findByIdChofer(id);

        return ViajeMapper.INSTANCE.toResponse(viajeChoferDTO);
    }
}
