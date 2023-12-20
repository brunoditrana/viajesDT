package com.example.viajesDT.service;

import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeEditRequest;
import com.example.viajesDT.dto.request.ViajePasajeroRequest;

import java.util.List;

public interface IPasajeroService {


    //Agregar un pasajero al sistema
    PasajeroDTO createPasajero (PasajeroDTO pas);

    PasajeroDTO findById(Long id);

    PasajeroDTO findByDni(Integer dni);

    List<ViajeDTO> findAllByDni(Integer dni);

    void pasajeroAUnViaje(ViajePasajeroRequest requets);

    void deletePasajero(Integer dni, String destino);


}
