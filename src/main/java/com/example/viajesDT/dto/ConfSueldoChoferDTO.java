package com.example.viajesDT.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfSueldoChoferDTO {

    private Long idConfSueldoChofer;

    private Long idChofer;

    private Double porcentaje;


}
