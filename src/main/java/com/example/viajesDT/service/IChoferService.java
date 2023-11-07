package com.example.viajesDT.service;


import com.example.viajesDT.dto.ChoferDTO;

import java.util.List;

public interface IChoferService {


    ChoferDTO createChofer(ChoferDTO chof);

    ChoferDTO findById(Long id);
    ChoferDTO findByAllId(List<Long> id);
}
