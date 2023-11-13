package com.example.viajesDT.mapper;


import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.request.ChoferRequest;
import com.example.viajesDT.dto.response.ChoferGetResponse;
import com.example.viajesDT.dto.response.ChoferResponse;
import com.example.viajesDT.entity.Chofer;
import com.example.viajesDT.entity.Viaje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChoferMapper {

    ChoferMapper INSTANCE = Mappers.getMapper(ChoferMapper.class);

    //Permite realizar conversiones entre  Chofer y ChoferDTO

    //@Mapping(constant = "9999999", target = "dni")
    @Mapping(source = "fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "viajesAsignados.idViaje", target = "viajesAsignados")
    ChoferDTO toDTO(Chofer chofer);

    @Mapping(source = "fechaCreacion", target = "fechaCreacion")
    Chofer toEntity(ChoferDTO choferDTO);


    ChoferDTO toDTO(ChoferRequest choferRequest);


    Long getId(Viaje viaje);

    ChoferResponse toResponse (ChoferDTO choferDTO);

    ChoferGetResponse toGetResponse(ChoferDTO choferDTO);

}
