package com.example.viajesDT.controller;


import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeRequest;
import com.example.viajesDT.dto.response.ViajeResponse;
import com.example.viajesDT.mapper.ViajeMapper;
import com.example.viajesDT.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "viajesDT/viaje")
@RestController
public class ViajeController {

    @Autowired
    IViajeService viajeService;

    @PostMapping("/")
    public ViajeResponse createViaje(@RequestBody ViajeRequest viajeRequest){

     ViajeDTO  viajeDTO =  viajeService.crearViaje(ViajeMapper.INSTANCE.toRequestDTO(viajeRequest));

      return  ViajeMapper.INSTANCE.toResponse(viajeDTO);

      // Consultar el Chofer por el ID
    }

    @GetMapping("/{id}")
    public ViajeDTO findById(@PathVariable Long id){


        return viajeService.findById(id);

    }

}
