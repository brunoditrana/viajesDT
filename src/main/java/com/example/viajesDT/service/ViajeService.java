package com.example.viajesDT.service;


import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.repository.IViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeService implements IViajeService{

    @Autowired
    private ViajeAdapter viajeAdapter;


    @Override
    public ViajeDTO crearViaje(ViajeDTO viajeDTO) {

       return viajeAdapter.save(viajeDTO);
    }
}
