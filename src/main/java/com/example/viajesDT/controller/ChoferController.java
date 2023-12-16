package com.example.viajesDT.controller;



import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.request.ChoferRequest;
import com.example.viajesDT.dto.response.ChoferGetResponse;
import com.example.viajesDT.dto.response.ChoferResponse;
import com.example.viajesDT.dto.response.DeudaAChoferesResponse;
import com.example.viajesDT.mapper.ChoferMapper;
import com.example.viajesDT.service.IChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "viajesDT/chofer")
@RestController
public class ChoferController {

    @Autowired
    IChoferService choferService;



    @PostMapping("/")
    public ChoferResponse createChofer(@RequestBody ChoferRequest chof){

        ChoferDTO choferDTO =  this.choferService.createChofer(ChoferMapper.INSTANCE.toDTO(chof));

        return  ChoferMapper.INSTANCE.toResponse(choferDTO);

    }

    @GetMapping("/{id}")
    public ChoferGetResponse findById(@PathVariable Long id){

       ChoferDTO chof = choferService.findById(id);

       return ChoferMapper.INSTANCE.toGetResponse(chof);
    }

    //Deuda que tengo con los choferes
    @GetMapping("/deudas")
    public List<DeudaAChoferesResponse> deudaAChoferes(){

        return choferService.deudaAChoferes();
    }

    //Pagarle a un chofer
    @PutMapping("/{dni}")
    public ResponseEntity<String>  pagarleAUnChofer(@PathVariable Integer dni){


        return  ResponseEntity.ok("Pasajero fue agregado al viaje exitosamente" );
    }
}
