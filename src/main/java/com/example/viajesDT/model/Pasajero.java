package com.example.viajesDT.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_pasajero;

    private String nombre;
    private String apellido;
    private int telefono;
    private int dni;
    private Date fecha_creacion;
    private Date fecha_modificacion;

    @ManyToMany(mappedBy = "lista_pasajeros")
    private List<Viaje>  viajes_asignados;

    public Pasajero(Long id_pasajero, String nombre, String apellido, int telefono, int dni, Date fecha_creacion, Date fecha_modificacion, List<Viaje> viajes_asignados) {
        this.id_pasajero = id_pasajero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
        this.viajes_asignados = viajes_asignados;
    }

    public Pasajero() {
    }
}
