package com.example.viajesDT.controller;


import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.request.VehiculoRequest;
import com.example.viajesDT.dto.response.VehiculoGetResponse;
import com.example.viajesDT.dto.response.VehiculoResponse;
import com.example.viajesDT.entity.Vehiculo;
import com.example.viajesDT.mapper.VehiculoMapper;
import com.example.viajesDT.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/{id}")
    public VehiculoGetResponse findById(@PathVariable Long id){

       VehiculoDTO vehi = vehiculoService.findById(id);

       return VehiculoMapper.INSTANCE.toResponseGet(vehi);
    }
}
