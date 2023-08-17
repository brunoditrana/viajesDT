package com.example.viajesDT.connector;


import com.example.viajesDT.adapter.ChoferAdapter;
import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.entity.Chofer;
import com.example.viajesDT.mapper.ChoferMapper;
import com.example.viajesDT.repository.IChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChoferConnector implements ChoferAdapter {

    @Autowired
    IChoferRepository choferRepo;

    public ChoferDTO findById( Long id ) throws Exception{

       Optional<Chofer> chofer = choferRepo.findById(id);

       return ChoferMapper.INSTANCE.toDTO(chofer.orElse(null));

    }

    @Override
    public ChoferDTO save(ChoferDTO choferRequest) {

     Chofer choferResponse =  choferRepo.save( ChoferMapper.INSTANCE.toEntity(choferRequest));

    return ChoferMapper.INSTANCE.toDTO(choferResponse);
    }

}
