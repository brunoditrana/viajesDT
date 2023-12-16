package com.example.viajesDT.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajePasajeroDTO {

    private Long idViajePasajero;

    private Long idViaje;

    private Long idPasajero;
}
