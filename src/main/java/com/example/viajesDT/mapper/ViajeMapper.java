package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeRequest;
import com.example.viajesDT.dto.response.ViajeResponse;
import com.example.viajesDT.entity.Viaje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;

@Mapper(imports = Date.class)
public interface ViajeMapper {

    ViajeMapper INSTANCE = Mappers.getMapper(ViajeMapper.class);


    ViajeDTO toDTO(Viaje viaje);

    @Mapping(target ="fechaCreacion", expression = "java(new Date())")
    Viaje toEntity(ViajeDTO viajeDTO);

    @Mapping(source = "viajeRequest.vehiculo", target = "vehiculo.idVehiculo")
    ViajeDTO toDTO(ViajeRequest viajeRequest);


    ViajeResponse toResponse(ViajeDTO viajeDTO);
}
