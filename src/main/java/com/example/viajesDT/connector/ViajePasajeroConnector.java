package com.example.viajesDT.connector;

import com.example.viajesDT.adapter.ViajePasajeroAdapter;
import com.example.viajesDT.dto.ViajePasajeroDTO;
import com.example.viajesDT.entity.ViajePasajero;
import com.example.viajesDT.mapper.ViajePasajeroMapper;
import com.example.viajesDT.repository.ViajePasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajePasajeroConnector implements ViajePasajeroAdapter {

    @Autowired
    private ViajePasajeroRepository viajePasajeroRepository;

    @Override
    public ViajePasajeroDTO findById(Long id) {

      ViajePasajero viajePasajero = viajePasajeroRepository.findById(id).orElse(null);

        return ViajePasajeroMapper.INSTANCE.toDTO(viajePasajero);
    }


    @Override
    public List<ViajePasajeroDTO> findByIdViaje(Long id) {

        List<ViajePasajero> viajePasajeros = viajePasajeroRepository.findByIdViaje(id);
        return ViajePasajeroMapper.INSTANCE.toListDTO(viajePasajeros);

    }

    @Override
    public List<ViajePasajeroDTO> findByIdPasajero(Long id) {
        List<ViajePasajero> viaje = viajePasajeroRepository.findByIdPasajero(id);

        return ViajePasajeroMapper.INSTANCE.toListDTO(viaje);
    }




}
