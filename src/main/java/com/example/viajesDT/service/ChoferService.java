package com.example.viajesDT.service;


import com.example.viajesDT.adapter.ChoferAdapter;
import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.response.ChoferResponse;
import com.example.viajesDT.entity.Chofer;
import com.example.viajesDT.repository.IChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoferService implements IChoferService{

    @Autowired
    private ChoferAdapter choferAdap;

    @Override
    public ChoferDTO createChofer(ChoferDTO chof) {
      return this.choferAdap.save(chof);

    }
}
