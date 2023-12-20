package com.example.viajesDT.controller;


import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeEditRequest;
import com.example.viajesDT.dto.request.ViajePasajeroRequest;
import com.example.viajesDT.dto.request.PasajeroRequest;
import com.example.viajesDT.dto.response.PasajeroGetResponse;
import com.example.viajesDT.dto.response.PasajeroResponse;
import com.example.viajesDT.dto.response.ViajeResponse;
import com.example.viajesDT.mapper.PasajeroMapper;
import com.example.viajesDT.mapper.ViajeMapper;
import com.example.viajesDT.service.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "viajesDT/pasajero")
@RestController
public class PasajeroController {

    @Autowired
    IPasajeroService pasajeService;



    @PostMapping("/")
    public PasajeroResponse createPasajero(@RequestBody PasajeroRequest pas){

        PasajeroDTO pasajeroDTO = pasajeService.createPasajero(PasajeroMapper.INSTANCE.toDTO(pas));

        return PasajeroMapper.INSTANCE.toResponse(pasajeroDTO);
    }

    @GetMapping("/{id}")
    public PasajeroGetResponse findById(@PathVariable Long id){

        PasajeroDTO pas = pasajeService.findById(id);

        return PasajeroMapper.INSTANCE.toGetResponse(pas);
    }

    //Buscar un pasajero por dni
    @GetMapping("/dni/{dni}")
    public PasajeroGetResponse findByDni(@PathVariable Integer dni){

        PasajeroDTO pas = pasajeService.findByDni(dni);

        return PasajeroMapper.INSTANCE.toGetResponse(pas);
    }

    //Agregar un pasajero a un viaje:
    @PutMapping("/")
    public ResponseEntity<String> pasajeroAUnViaje(@RequestBody ViajePasajeroRequest requets){

            pasajeService.pasajeroAUnViaje(requets);

        return  ResponseEntity.ok("Pasajero fue agregado al viaje exitosamente" );
    }


    //Get de todos los viajes de un pasajero
    @GetMapping("/viajes/{dni}")
    public  List<ViajeResponse>  findAllViaje(@PathVariable Integer dni){

        List<ViajeDTO> viajeDTO = pasajeService.findAllByDni(dni);
        return ViajeMapper.INSTANCE.toListViajeResponse(viajeDTO);
    }

    //Eliminar un pasajero de un viaje
    @DeleteMapping("/eliminar/{dni}/{destino}")
    public ResponseEntity<String> deletePasajero(@PathVariable Integer dni,
                                                 @PathVariable String destino){

        pasajeService.deletePasajero(dni,destino);
        return  ResponseEntity.ok("Pasajero fue eliminado del viaje exitosamente" );

    }


}
