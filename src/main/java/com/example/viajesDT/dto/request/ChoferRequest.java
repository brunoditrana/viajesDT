package com.example.viajesDT.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoferRequest {


    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
    private Boolean activo;

}
