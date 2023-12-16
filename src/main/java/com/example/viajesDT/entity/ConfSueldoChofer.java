package com.example.viajesDT.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ConfSueldoChofer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conf_sueldo_chofer")
    private Long confSueldoChofer;

    @Column(name = "id_chofer")
    private Long idChofer;

    private Double porcentaje;

}
