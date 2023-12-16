package com.example.viajesDT.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroRequest {


    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;


}




