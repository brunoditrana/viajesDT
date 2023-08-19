package com.example.viajesDT.connector;

import com.example.viajesDT.adapter.VehiculoAdapter;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.response.VehiculoGetResponse;
import com.example.viajesDT.entity.Vehiculo;
import com.example.viajesDT.mapper.VehiculoMapper;
import com.example.viajesDT.repository.IVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehiculoConnector implements VehiculoAdapter {


    @Autowired
    private IVehiculoRepository vehiculoRepo;

    @Override
    public VehiculoDTO save(VehiculoDTO vehiculoDTO) {

       Vehiculo vehiculo =  vehiculoRepo.save(VehiculoMapper.INSTANCE.toEntity(vehiculoDTO));
        return VehiculoMapper.INSTANCE.toDTO(vehiculo);

    }

    @Override
    public VehiculoDTO findById(Long id) {
        Optional<Vehiculo> veh = vehiculoRepo.findById(id);
        return VehiculoMapper.INSTANCE.toDTO(veh.orElse(null));
    }
}
