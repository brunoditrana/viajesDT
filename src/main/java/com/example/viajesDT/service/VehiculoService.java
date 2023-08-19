package com.example.viajesDT.service;


import com.example.viajesDT.adapter.VehiculoAdapter;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.response.VehiculoGetResponse;
import com.example.viajesDT.dto.response.VehiculoResponse;
import com.example.viajesDT.mapper.VehiculoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService implements IVehiculoService{

    @Autowired
    private VehiculoAdapter vehiculoAdapter;



    @Override
    public VehiculoDTO createVehiculo(VehiculoDTO veh) {

        return vehiculoAdapter.save(veh);
    }

    @Override
    public VehiculoDTO findById(Long id) {

        return vehiculoAdapter.findById(id);

    }


}

