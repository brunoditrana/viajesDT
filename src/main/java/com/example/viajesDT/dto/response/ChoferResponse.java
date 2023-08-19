package com.example.viajesDT.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoferResponse {

    @Column(name = "id_chofer")
    private Long idChofer;
    private Integer dni;
}
