package com.example.viajesDT.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViajeChoferDTO {



        private Long idViajeChofer;

        private Long idViaje;

        private Long idChofer;

        private Boolean pagado;


}
