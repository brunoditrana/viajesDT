package com.example.viajesDT.controller;


import com.example.viajesDT.model.Pasajero;
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



    //Agregar un pasajero al sistema
    @PostMapping("/")
    public Pasajero createPasajero(@RequestBody Pasajero pas){
        this.pasajeService.createPasajero(pas);
        return pas;
    }



}
