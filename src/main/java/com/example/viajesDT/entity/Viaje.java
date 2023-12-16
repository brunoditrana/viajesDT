package com.example.viajesDT.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Viaje {

    public Viaje(Long idViaje){
        this.setIdViaje(idViaje);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viaje")
    private Long idViaje;

    private String destino;
    @Column(name = "fecha_salida")
    private Date fechaSalida;
    @Column(name = "fecha_llegada")
    private Date fechaLlegada;
    private Double precio;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;


    @ManyToMany
    @JoinTable(name = "viaje_chofer",
     joinColumns = @JoinColumn(name = "id_viaje"),
        inverseJoinColumns = @JoinColumn(name = "id_chofer"))
    private List<Chofer> listaChoferes;

    @ManyToMany
    @JoinTable(name = "viaje_pasajero",
    joinColumns = @JoinColumn(name = "id_viaje"),
    inverseJoinColumns = @JoinColumn(name = "id_pasajero"))
    private List<Pasajero> listaPasajeros;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo vehiculo;



}
