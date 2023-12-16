package com.example.viajesDT.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ViajePasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viaje_pasajero")
    private Long idViajePasajero;

    @Column(name = "id_viaje")
    private Long idViaje;
    @Column(name = "id_pasajero")
    private Long idPasajero;
}
