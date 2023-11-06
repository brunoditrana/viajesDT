package com.example.viajesDT.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroDTO {

    private Long idPasajero;

    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
    private Date fechaCreacion;
    private Date fechaModificacion;


}
