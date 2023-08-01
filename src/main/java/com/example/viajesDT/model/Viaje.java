package com.example.viajesDT.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_viaje;

    private String destino;
    private Date fecha_salida;
    private Date fecha_llegada;
    private Double precio;
    private Date fecha_creacion;
    private Date fecha_modificacion;

    @ManyToMany
    @JoinTable(name = "viaje_chofer",
     joinColumns = @JoinColumn(name = "id_viaje"),
        inverseJoinColumns = @JoinColumn(name = "id_chofer"))
    private List<Chofer> lista_choferes;

    @ManyToMany
    @JoinTable(name = "viaje_pasajero",
    joinColumns = @JoinColumn(name = "id_viaje"),
    inverseJoinColumns = @JoinColumn(name = "id_pasajero"))
    private List<Pasajero> lista_pasajeros;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo vehiculo;


    public Viaje(Long id_viaje, String destino, Date fecha_salida, Date fecha_llegada, Double precio, Date fecha_creacion, Date fecha_modificacion, List<Chofer> lista_choferes, List<Pasajero> lista_pasajeros, Vehiculo vehiculo) {
        this.id_viaje = id_viaje;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.precio = precio;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
        this.lista_choferes = lista_choferes;
        this.lista_pasajeros = lista_pasajeros;
        this.vehiculo = vehiculo;
    }

    public Viaje() {
    }
}
