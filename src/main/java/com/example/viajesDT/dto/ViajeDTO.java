package com.example.viajesDT.dto;

import com.example.viajesDT.entity.Chofer;
import com.example.viajesDT.entity.Pasajero;
import com.example.viajesDT.entity.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajeDTO {


    private Long idViaje;
    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private Double precio;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private List<Chofer> lista_choferes;
    private List<Pasajero> lista_pasajeros;
    private Vehiculo vehiculo;


}
