package com.example.viajesDT.controller;


import com.example.viajesDT.model.Chofer;
import com.example.viajesDT.service.IChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "viajesDT/chofer")
@RestController
public class ChoferController {

    @Autowired
    IChoferService choferService;



    @PostMapping("/")
    public Chofer createChofer(@RequestBody Chofer chof){
        this.choferService.createChofer(chof);
        return chof;
    }
}
