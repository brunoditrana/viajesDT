package com.example.viajesDT.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoResponse {

    @Column(name = "id_vehiculo")
    private Long idVehiculo;

    private String tipoVehiculo;
    private Integer capacidad;
    private String estado;
}
