package com.example.viajesDT.connector;

import com.example.viajesDT.adapter.ConfSueldoChoferAdapter;
import com.example.viajesDT.dto.ConfSueldoChoferDTO;
import com.example.viajesDT.entity.ConfSueldoChofer;
import com.example.viajesDT.mapper.ConfSueldoChoferMapper;
import com.example.viajesDT.repository.IConfSueldoChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfSueldoChoferConnector implements ConfSueldoChoferAdapter {


    @Autowired
    private IConfSueldoChoferRepository repo;

    @Override
    public ConfSueldoChoferDTO findByChoferId(Long choferId) {

        ConfSueldoChofer conf = repo.findByChoferId(choferId);

        return ConfSueldoChoferMapper.INSTANCE.toDTO(conf);
    }
}
