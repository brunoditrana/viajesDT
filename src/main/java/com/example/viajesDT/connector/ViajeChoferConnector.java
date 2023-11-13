package com.example.viajesDT.connector;

import com.example.viajesDT.adapter.ViajeChoferAdapter;
import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.entity.ViajeChofer;
import com.example.viajesDT.mapper.ViajeChoferMapper;
import com.example.viajesDT.repository.IViajeChoferRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ViajeChoferConnector implements ViajeChoferAdapter {

    @Autowired
    IViajeChoferRepository viajeChoferRepo;

    @Override
    public ViajeChoferDTO findById(Long id) {

        Optional<ViajeChofer> viajeChoferDTO = viajeChoferRepo.findById(id);

        return ViajeChoferMapper.INSTANCE.toDTO(viajeChoferDTO.orElse(null));
    }

    @Override
    public List<ViajeChoferDTO> findByChoferId(Long choferId) {


         Optional<ViajeChofer> listaDeViajeChofer = viajeChoferRepo.findByIdChofer(choferId);

       return ViajeChoferMapper.INSTANCE.toDTOList((List<ViajeChofer>) listaDeViajeChofer.orElse(null));
    }
}
