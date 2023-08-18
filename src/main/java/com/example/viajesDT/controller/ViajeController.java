package com.example.viajesDT.controller;


import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeRequest;
import com.example.viajesDT.dto.response.ViajeResponse;
import com.example.viajesDT.mapper.ViajeMapper;
import com.example.viajesDT.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(path = "viajesDT/viaje")
@RestController
public class ViajeController {

    @Autowired
    IViajeService viajeService;

    @PostMapping("/")
    public ViajeResponse createViaje(@RequestBody ViajeRequest viajeRequest){

      ViajeDTO viajeDTO = viajeService.crearViaje(ViajeMapper.INSTANCE.toDTO(viajeRequest));

      return  ViajeMapper.INSTANCE.toResponse(viajeDTO);
    }

}
