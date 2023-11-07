package com.example.viajesDT.dto.response;

import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.VehiculoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajeChoferResponse {

    private List<ChoferDTO> listaChoferes;
    private List<PasajeroDTO> listaPasajeros;
    private VehiculoDTO vehiculo;

    private Integer capacidad;

    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private Double precio;
}
