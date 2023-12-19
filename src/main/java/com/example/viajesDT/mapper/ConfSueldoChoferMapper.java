package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.ConfSueldoChoferDTO;
import com.example.viajesDT.entity.ConfSueldoChofer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Date;

@Mapper(imports =  Date.class)
public interface ConfSueldoChoferMapper {

    ConfSueldoChoferMapper INSTANCE = Mappers.getMapper(ConfSueldoChoferMapper.class);


    ConfSueldoChoferDTO toDTO(ConfSueldoChofer confSueldoChofer);
}
