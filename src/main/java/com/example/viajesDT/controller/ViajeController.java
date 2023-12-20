package com.example.viajesDT.controller;


import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.request.ViajeEditRequest;
import com.example.viajesDT.dto.request.ViajeRequest;
import com.example.viajesDT.dto.response.ViajeResponse;
import com.example.viajesDT.mapper.ViajeMapper;
import com.example.viajesDT.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "viajesDT/viaje")
@RestController
public class ViajeController {

    @Autowired
    IViajeService viajeService;

    @PostMapping("/")
    public ViajeResponse createViaje(@RequestBody ViajeRequest viajeRequest){

     ViajeDTO  viajeDTO =  viajeService.crearViaje(ViajeMapper.INSTANCE.toRequestDTO(viajeRequest));

      return  ViajeMapper.INSTANCE.toResponse(viajeDTO);

      // Consultar el Chofer por el ID
    }

    @GetMapping("/{id}")
    public ViajeDTO findById(@PathVariable Long id){


        return viajeService.findById(id);

    }
    //endpoint para consultar todos los viajes no realizados
    @GetMapping("/pendientes")
    public  List<ViajeResponse> findAllViajesPendientes(){

        List<ViajeDTO> viaje = viajeService.findAllViajesPendientes();

        return ViajeMapper.INSTANCE.toListViajeResponse(viaje);
    }


    // Modificar viaje de un pasajero: Cambiar de hora de salida, persona q viaja

    @PutMapping("/edit/")
    public ResponseEntity<String> editPersona(@RequestBody ViajeEditRequest request){

        viajeService.editViaje(request);

        return  ResponseEntity.ok("El Viaje fue Editado exitosamente" );
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteViaje(@PathVariable Long id){

        viajeService.deleteViaje(id);

        return  ResponseEntity.ok("El Viaje fue Eliminado exitosamente" );
    }
}
