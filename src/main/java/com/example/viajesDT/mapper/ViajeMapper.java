package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeRequest;
import com.example.viajesDT.dto.request.dto.ViajeRequestDTO;
import com.example.viajesDT.dto.response.ViajeResponse;
import com.example.viajesDT.entity.Viaje;
import com.example.viajesDT.entity.ViajeChofer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import org.mapstruct.factory.Mappers;



import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(imports = Date.class)
public interface ViajeMapper {

    ViajeMapper INSTANCE = Mappers.getMapper(ViajeMapper.class);

    ViajeDTO toDTO(Viaje viaje);

    @Mapping(target ="fechaCreacion", expression = "java(new Date())")
    Viaje toEntity(ViajeDTO viajeDTO);

  //  @Mapping(source = "viajeRequest.vehiculo", target = "vehiculo.idVehiculo")
   // ViajeDTO toDTO(ViajeRequest viajeRequest);


    ViajeResponse toResponse(ViajeDTO viajeDTO);

    //ViajeChofer
    ViajeChoferDTO toDto(ViajeChofer viajeChofer);
    List<ViajeChoferDTO> toDto(List<ViajeChofer> viajeChofer);

   // ViajeChoferResponse toResponse(Optional<ViajeChofer> ViajeChofer);
     ViajeRequestDTO toRequestDTO(ViajeRequest viajeRequest) ;


    //MApper para consultar todos los viajes no realizados
     List<ViajeDTO> toListViajeDto(List<Viaje> viaje);

     List<ViajeResponse> toListViajeResponse(List<ViajeDTO> viaje);


    default List<Viaje> map(List<Long> value){
        return value.stream().map(this::constructorViaje)
                .collect(Collectors.toList());
    }

    default List<Long> map2(List<Viaje> value) {
        return value.stream().map(Viaje::getIdViaje).collect(Collectors.toList());
    }
    default Long map3(Viaje value){
        return value.getIdViaje();
    }

    default Viaje constructorViaje(Long value){
        return new Viaje(value);
    }


}

