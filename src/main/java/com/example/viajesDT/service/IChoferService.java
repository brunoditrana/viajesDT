package com.example.viajesDT.service;


import com.example.viajesDT.dto.ChoferDTO;

public interface IChoferService {


    ChoferDTO createChofer(ChoferDTO chof);

    ChoferDTO findById(Long id);
}
