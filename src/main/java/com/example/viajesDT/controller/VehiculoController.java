package com.example.viajesDT.controller;


import com.example.viajesDT.model.Vehiculo;
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
    public Vehiculo createVehiculo(@RequestBody Vehiculo veh){
        this.vehiculoService.createVehiculo(veh);
        return veh;
    }

}
