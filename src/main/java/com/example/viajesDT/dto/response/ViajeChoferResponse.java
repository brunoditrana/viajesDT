package com.example.viajesDT.dto.response;

import com.example.viajesDT.dto.VehiculoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajeChoferResponse {

    private Long idChofer;

    private Integer capacidad;

    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private Double precio;
    private VehiculoDTO vehiculo;
}
