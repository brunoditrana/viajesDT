package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeRequest;
import com.example.viajesDT.dto.response.ViajeResponse;
import com.example.viajesDT.entity.Viaje;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ViajeMapper {

    ViajeMapper INSTANCE = Mappers.getMapper(ViajeMapper.class);


    ViajeDTO toDTO(Viaje viaje);

    Viaje toEntity(ViajeDTO viajeDTO);

    ViajeDTO toDTO(ViajeRequest viajeRequest);


    ViajeResponse toResponse(ViajeDTO viajeDTO);
}
