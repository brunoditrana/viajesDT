package com.example.viajesDT.controller;


import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.request.VehiculoRequest;
import com.example.viajesDT.dto.response.VehiculoResponse;
import com.example.viajesDT.entity.Vehiculo;
import com.example.viajesDT.mapper.VehiculoMapper;
import com.example.viajesDT.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "viajesDT/vehiculo")
@RestController
public class VehiculoController {

    @Autowired
    IVehiculoService vehiculoService;

    @PostMapping("/")
    public VehiculoResponse createVehiculo(@RequestBody VehiculoRequest vehiculoRequest){

       VehiculoDTO dto = vehiculoService.createVehiculo(VehiculoMapper.INSTANCE.toDTO(vehiculoRequest));

       return VehiculoMapper.INSTANCE.toResponse(dto);
    }

}
