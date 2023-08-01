package com.example.viajesDT.controller;


import com.example.viajesDT.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViajeController {

    @Autowired
    IViajeService viajeService;

}
