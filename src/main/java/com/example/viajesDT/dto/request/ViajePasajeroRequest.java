package com.example.viajesDT.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajePasajeroRequest {

    private Long idPasajero;
    private Long idViaje;
}
