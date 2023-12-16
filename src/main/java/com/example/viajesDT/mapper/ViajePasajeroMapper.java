package com.example.viajesDT.mapper;


import com.example.viajesDT.dto.ViajePasajeroDTO;
import com.example.viajesDT.entity.ViajePasajero;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.List;

@Mapper(imports =  Date.class)
public interface ViajePasajeroMapper {

    ViajePasajeroMapper INSTANCE = Mappers.getMapper(ViajePasajeroMapper.class);

    ViajePasajeroDTO toDTO(ViajePasajero viajePasajero);

    List<ViajePasajeroDTO> toListDTO( List<ViajePasajero> list);
}
