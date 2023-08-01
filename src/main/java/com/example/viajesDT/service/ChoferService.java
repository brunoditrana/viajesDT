package com.example.viajesDT.service;


import com.example.viajesDT.model.Chofer;
import com.example.viajesDT.repository.IChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoferService implements IChoferService{

    @Autowired
    private IChoferRepository choferRepo;

    @Override
    public void createChofer(Chofer chof) {
        this.choferRepo.save(chof);
    }
}
