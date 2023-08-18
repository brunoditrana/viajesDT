package com.example.viajesDT.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajeRequest {


    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private Double precio;
}
