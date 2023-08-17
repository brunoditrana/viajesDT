package com.example.viajesDT.controller;



import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.request.ChoferRequest;
import com.example.viajesDT.dto.response.ChoferResponse;
import com.example.viajesDT.mapper.ChoferMapper;
import com.example.viajesDT.service.IChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
