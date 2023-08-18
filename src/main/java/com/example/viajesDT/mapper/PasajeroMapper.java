package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.request.PasajeroRequest;
import com.example.viajesDT.dto.response.PasajeroResponse;
import com.example.viajesDT.entity.Pasajero;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PasajeroMapper {

    //Realiza converciones entre objetos (DTO - Entity) de manera automatica

    PasajeroMapper INSTANCE = Mappers.getMapper(PasajeroMapper.class);
    // Esto se utiliza para obtener una intancia de un Mapper y asi poder realizar conversiones



    PasajeroDTO toDTO(Pasajero pasajero);

    Pasajero toEntity(PasajeroDTO pasajeroDTO);

    PasajeroDTO toDTO(PasajeroRequest pasajeroRequest);

    PasajeroResponse toResponse(PasajeroDTO pasajeroDTO);
}
