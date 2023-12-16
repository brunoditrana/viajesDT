package com.example.viajesDT.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroGetResponse {


    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
}
