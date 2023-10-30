package com.example.viajesDT.connector;


import com.example.viajesDT.adapter.PasajeroAdapter;
import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.entity.Pasajero;
import com.example.viajesDT.mapper.PasajeroMapper;
import com.example.viajesDT.repository.IPasajeroRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PasajeroConnector implements PasajeroAdapter {

    @Autowired
    IPasajeroRepository pasajeroRepo;

    @Override
    public PasajeroDTO save(PasajeroDTO pasajeroDTO) {

        Pasajero pasajeroResponse = pasajeroRepo.save(PasajeroMapper.INSTANCE.toEntity(pasajeroDTO));

        return PasajeroMapper.INSTANCE.toDTO(pasajeroResponse);
    }

    @Override
    public PasajeroDTO findById(Long id) {

       Optional<Pasajero> pasa = pasajeroRepo.findById(id);

        return PasajeroMapper.INSTANCE.toDTO(pasa.orElse(null));
    }


}
