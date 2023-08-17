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
public class Chofer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_chofer;

    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
    private Boolean activo;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    private Date fecha_modificacion;

   // @ManyToMany(mappedBy = "lista_choferes")
    //private List<Viaje> viajes_asignados;



}
