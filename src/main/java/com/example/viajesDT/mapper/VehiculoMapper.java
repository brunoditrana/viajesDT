package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.request.VehiculoRequest;
import com.example.viajesDT.dto.response.VehiculoGetResponse;
import com.example.viajesDT.dto.response.VehiculoResponse;
import com.example.viajesDT.entity.Vehiculo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;

@Mapper(imports = Date.class)
public interface VehiculoMapper {

    VehiculoMapper INSTANCE = Mappers.getMapper(VehiculoMapper.class);


    VehiculoDTO toDTO(Vehiculo vehiculo);

    @Mapping(target ="fechaCreacion", expression = "java(new Date())")
    Vehiculo toEntity(VehiculoDTO vehiculoDTO);

    VehiculoDTO toDTO(VehiculoRequest vehiculoRequest);

    VehiculoResponse toResponse(VehiculoDTO vehiculoDTO);


    VehiculoGetResponse toResponseGet(VehiculoDTO vehiculo);
}
