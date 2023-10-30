package com.example.viajesDT.dto.request;

import com.example.viajesDT.entity.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajeRequest {


    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private Double precio;
    private List<Long> listaChoferes;
    private Long vehiculo;
}
