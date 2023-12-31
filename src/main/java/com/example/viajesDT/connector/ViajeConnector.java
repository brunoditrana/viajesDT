package com.example.viajesDT.connector;

import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.dto.ViajeChoferDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.entity.Viaje;
import com.example.viajesDT.entity.ViajeChofer;
import com.example.viajesDT.mapper.ViajeMapper;
import com.example.viajesDT.repository.IViajeChoferRepository;
import com.example.viajesDT.repository.IViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ViajeConnector implements ViajeAdapter {

    @Autowired
    private IViajeRepository viajeRepo;

   @Autowired
   private IViajeChoferRepository viajeChoferRepository;

    @Override
    public ViajeDTO save(ViajeDTO viajeDTO) {

      Viaje viaje = viajeRepo.save(ViajeMapper.INSTANCE.toEntity(viajeDTO));
      //A parti del viaje .id gaurdar en ViajeChoferrepository los choferes y el viaje

      return ViajeMapper.INSTANCE.toDTO(viaje);
    }

    @Override
    public ViajeDTO findById(Long id) {

        Optional<Viaje> viaje = viajeRepo.findById(id);


        return ViajeMapper.INSTANCE.toDTO(viaje.orElse(null));
    }

    @Override
    public ViajeChoferDTO findViajeByIdChofer(Long id) {
        Optional<ViajeChofer> viaje = viajeChoferRepository.findByIdChofer(id);

        return ViajeMapper.INSTANCE.toDto(viaje.orElse(null));
    }


}
