package com.example.viajesDT.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ViajeChofer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viaje_chofer")
    private Long idViajeChofer;

    @Column(name = "id_viaje")
    private Long idViaje;
    @Column(name = "id_chofer")
    private Long idChofer;

    private boolean pagado;

}
