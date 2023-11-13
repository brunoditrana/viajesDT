package com.example.viajesDT.dto.response;

import com.example.viajesDT.dto.ViajeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoferGetResponse {


    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
    private Boolean activo;

    private List<Long> viajesAsignados;

    private List<Long> viajesRealizados;
}
