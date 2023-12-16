package com.example.viajesDT.mapper;

import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.entity.ViajeChofer;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.List;


@Mapper(imports =  Date.class)
public interface ViajeChoferMapper {

    ViajeChoferMapper INSTANCE = Mappers.getMapper(ViajeChoferMapper.class);

    @Mapping(target ="pagado", source = "pagado")
    ViajeChoferDTO toDTO(ViajeChofer viajeChofer);

    @IterableMapping(elementTargetType = ViajeChoferDTO.class)
    List<ViajeChoferDTO> toDTOList(List<ViajeChofer> viajeChofer);


}
