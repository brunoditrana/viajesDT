package com.example.viajesDT.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajeResponse {


    private Long idViaje;
    private String destino;
    private Date fechaSalida;
}
