package com.example.viajesDT.adapter;


import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.entity.Chofer;

public interface ChoferAdapter {


    //Puente entre el Service y el connector
     ChoferDTO findById(Long id ) throws Exception;

        ChoferDTO  save(ChoferDTO chofer);
}
