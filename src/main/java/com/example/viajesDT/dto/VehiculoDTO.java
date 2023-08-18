package com.example.viajesDT.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoDTO {

    private Long idVehiculo;
    private String tipoVehiculo;
    private String modelo ;
    private String patente;
    private Integer capacidad;
    private Integer kmRecorridos;
    private String estado;
    private Date fechaCreacion;
    private Date fechaModificacion;
}
