package com.example.viajesDT.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoGetResponse {

    private String tipoVehiculo;
    private String modelo ;
    private String patente;
    private Integer capacidad;
    private Integer kmRecorridos;
    private String estado;
}
