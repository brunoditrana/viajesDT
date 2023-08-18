package com.example.viajesDT.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoRequest {



    private String tipoVehiculo;
    private String modelo ;
    private String patente;
    private Integer capacidad;
    private Integer kmRecorridos;
    private String estado;
}
