package com.example.viajesDT.controller;


import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.request.PasajeroRequest;
import com.example.viajesDT.dto.response.PasajeroResponse;
import com.example.viajesDT.mapper.PasajeroMapper;
import com.example.viajesDT.service.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "viajesDT/pasajero")
@RestController
public class PasajeroController {

    @Autowired
    IPasajeroService pasajeService;



    @PostMapping("/")
    public PasajeroResponse createPasajero(@RequestBody PasajeroRequest pas){

        PasajeroDTO pasajeroDTO = pasajeService.createPasajero(PasajeroMapper.INSTANCE.toDTO(pas));

        return PasajeroMapper.INSTANCE.toResponse(pasajeroDTO);
    }



}
