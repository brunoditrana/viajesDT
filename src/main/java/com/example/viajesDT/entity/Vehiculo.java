package com.example.viajesDT.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Long idVehiculo;

    @Column(name = "tipo_vehiculo")
    private String tipoVehiculo;
    private String modelo ;
    private String patente;
    private Integer capacidad;
    @Column(name = "km_recorridos")
    private Integer kmRecorridos;
    private String estado;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;



}
