package com.example.viajesDT.adapter;

import com.example.viajesDT.dto.ConfSueldoChoferDTO;
import com.example.viajesDT.entity.ConfSueldoChofer;

public interface ConfSueldoChoferAdapter {


    ConfSueldoChoferDTO findByChoferId(Long choferId);
}
