package com.example.viajesDT.service;


import com.example.viajesDT.repository.IViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeService implements IViajeService{

    @Autowired
    private IViaje viajeRepo;
}
