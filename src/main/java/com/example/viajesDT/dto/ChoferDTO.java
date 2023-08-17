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


    private Long id_chofer;

    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
    private Boolean activo;
    private Date fecha_creacion;
    private Date fecha_modificacion;
    private List<Viaje> viajes_asignados;

}
