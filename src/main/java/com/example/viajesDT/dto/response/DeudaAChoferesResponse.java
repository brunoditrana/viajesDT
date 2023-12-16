package com.example.viajesDT.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeudaAChoferesResponse {

    private Long idViaje;

    private Long idChofer;

    private Double precio;

}
