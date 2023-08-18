package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.request.VehiculoRequest;
import com.example.viajesDT.dto.response.VehiculoResponse;
import com.example.viajesDT.entity.Vehiculo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VehiculoMapper {

    VehiculoMapper INSTANCE = Mappers.getMapper(VehiculoMapper.class);


    VehiculoDTO toDTO(Vehiculo vehiculo);

    Vehiculo toEntity(VehiculoDTO vehiculoDTO);

    VehiculoDTO toDTO(VehiculoRequest vehiculoRequest);

    VehiculoResponse toResponse(VehiculoDTO vehiculoDTO);
}
