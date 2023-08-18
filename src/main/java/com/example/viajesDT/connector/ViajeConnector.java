package com.example.viajesDT.connector;

import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.entity.Viaje;
import com.example.viajesDT.mapper.ViajeMapper;
import com.example.viajesDT.repository.IViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeConnector implements ViajeAdapter {

    @Autowired
    private IViajeRepository viajeRepo;


    @Override
    public ViajeDTO save(ViajeDTO viajeDTO) {

      Viaje viaje = viajeRepo.save(ViajeMapper.INSTANCE.toEntity(viajeDTO));

      return ViajeMapper.INSTANCE.toDTO(viaje);
    }
}
