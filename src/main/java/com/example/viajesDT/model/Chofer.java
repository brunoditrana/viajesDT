package com.example.viajesDT.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Chofer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_chofer;

    private String nombre;
    private String apellido;
    private int telefono;
    private int dni;
    private boolean activo;
    private Date fecha_creacion;
    private Date fecha_modificacion;

    @ManyToMany(mappedBy = "lista_choferes")
    private List<Viaje> viajes_asignados;


    public Chofer(Long id_chofer, String nombre, String apellido, int telefono, int dni, boolean activo, Date fecha_creacion, Date fecha_modificacion, List<Viaje> viajes_asignados) {
        this.id_chofer = id_chofer;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.activo = activo;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
        this.viajes_asignados = viajes_asignados;
    }

    public Chofer() {
    }
}
