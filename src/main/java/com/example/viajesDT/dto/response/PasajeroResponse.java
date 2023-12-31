package com.example.viajesDT.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroResponse {

    private Long id;

    private String nombre;
    private String apellido;
    private Integer telefono;

}
