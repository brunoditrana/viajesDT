package com.example.viajesDT.service;


import com.example.viajesDT.adapter.PasajeroAdapter;
import com.example.viajesDT.adapter.VehiculoAdapter;
import com.example.viajesDT.adapter.ViajeAdapter;
import com.example.viajesDT.adapter.ViajePasajeroAdapter;
import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.dto.VehiculoDTO;
import com.example.viajesDT.dto.ViajeDTO;
import com.example.viajesDT.dto.ViajePasajeroDTO;
import com.example.viajesDT.dto.request.ViajePasajeroRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PasajeroService implements IPasajeroService{


    @Autowired
    private PasajeroAdapter pasajeroAdapter;

    @Autowired
    private ViajeAdapter viajeAdapter;

    @Autowired
   private VehiculoAdapter vehiculoAdapter;

    @Autowired
    private ViajePasajeroAdapter viajePasajeroAdapter;

    @Override
    public PasajeroDTO createPasajero(PasajeroDTO pas) {

        return pasajeroAdapter.save(pas);
    }

    @Override
    public PasajeroDTO findById(Long id) {
        return pasajeroAdapter.findById(id);
    }

    @Override
    public PasajeroDTO findByDni(Integer dni) {
        return pasajeroAdapter.findByDni(dni);
    }

    public void pasajeroAUnViaje(ViajePasajeroRequest requets) {

        try {


            ViajeDTO viaje = viajeAdapter.findById(requets.getIdViaje());

            if (viaje == null) {
                throw new RuntimeException("No se encontro el viaje en la base de datos");
            }
            VehiculoDTO vehiculo = viaje.getVehiculo();
            Integer capacidad = 0;
            if (vehiculoAdapter.findById(vehiculo.getIdVehiculo()).getEstado().equals("Disponible")) {
                log.info("entro al if");
                capacidad = vehiculo.getCapacidad();
            } else {
                throw new RuntimeException("El vehiculo no se encuentra habilitado");
            }
/// Buscar en la lisa viajePasajero

            PasajeroDTO pasajeroDTO = pasajeroAdapter.findById(requets.getIdPasajero());

            List<ViajePasajeroDTO> listaPasajeros = viajePasajeroAdapter.findByViajeId(viaje.getIdViaje());


            int cantidadPasajeros = listaPasajeros.size();

            if (cantidadPasajeros > capacidad) {
                throw new RuntimeException("La capacidad del vehiculo llego a su maximo");
            } else {

                //Le agrego un pasajero a la lista
                viaje.getListaPasajeros().add(pasajeroDTO);

                //Actualizo la lista guardandolo
                viajeAdapter.save(viaje);
            }
        }catch(Exception e ){
            log.error(e.getMessage());
        }
    }
}
