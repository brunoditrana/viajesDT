package com.example.viajesDT.dto;


import com.example.viajesDT.entity.Viaje;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoferDTO {


    private Long idChofer;

    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
    private Boolean activo;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private List<Long> viajesAsignados;

    private List<Long> viajesRealizados;


}
