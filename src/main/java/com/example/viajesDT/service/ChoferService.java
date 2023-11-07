package com.example.viajesDT.service;


import com.example.viajesDT.adapter.ChoferAdapter;
import com.example.viajesDT.dto.ChoferDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoferService implements IChoferService{

    @Autowired
    private ChoferAdapter choferAdap;

    @Override
    public ChoferDTO createChofer(ChoferDTO chof) {
      return this.choferAdap.save(chof);

    }

    @Override
    public ChoferDTO findById(Long id) {

        //ChoferDTO choferDTO = choferAdap.findById(id);
        //consulto la tabla viajeChofer
        //para la lista de viajes, obtener el id del viaje
        //para cada id, consulto el viaje
        //para cada viaje veo si la fecha de salida es posterio o anterior a hoy y lo guardo en dos listas
        //la lista viajesRealizados la seteo en el DTO en el campo ViajesRealizados
        //la lista viajesAsignados la seteo en el DTO en el campo ViajesAsignados

 //       choferDTO.setViajesRealizados();
 //       choferDTO.setViajes_asignados();
        return choferAdap.findById(id);
    }

    @Override
    public ChoferDTO findByAllId(List<Long> id) {
        return null;
    }
}
