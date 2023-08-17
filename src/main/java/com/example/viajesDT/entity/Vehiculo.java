package com.example.viajesDT.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_vehiculo;

    private String tipo_vehiculo;
    private String modelo ;
    private String patente;
    private int capacidad;
    private int km_recorridos;
    private String estado;
    private Date fecha_creacion;
    private Date fecha_modificacion;


    public Vehiculo() {
    }

    public Vehiculo(Long id_vehiculo, String tipo_vehiculo, String modelo, String patente, int capacidad, int km_recorridos, String estado, Date fecha_creacion, Date fecha_modificacion) {
        this.id_vehiculo = id_vehiculo;
        this.tipo_vehiculo = tipo_vehiculo;
        this.modelo = modelo;
        this.patente = patente;
        this.capacidad = capacidad;
        this.km_recorridos = km_recorridos;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
}
