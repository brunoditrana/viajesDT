package com.example.viajesDT.service;


import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.response.DeudaAChoferesResponse;

import java.util.List;

public interface IChoferService {


    ChoferDTO createChofer(ChoferDTO chof);

    ChoferDTO findById(Long id);
    ChoferDTO findByAllId(List<Long> id);

    List<DeudaAChoferesResponse> deudaAChoferes();

    ChoferDTO findByDni(Integer dni);

    void pagarleAUnChofer(Integer dni);

    void deleteChofer(Long id);
}
