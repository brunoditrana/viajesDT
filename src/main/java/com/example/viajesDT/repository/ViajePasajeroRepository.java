package com.example.viajesDT.repository;


import com.example.viajesDT.entity.ViajePasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViajePasajeroRepository extends JpaRepository<ViajePasajero,Long> {

    List<ViajePasajero> findByIdViaje(Long id);

    List<ViajePasajero> findByIdPasajero(Long id);



}
