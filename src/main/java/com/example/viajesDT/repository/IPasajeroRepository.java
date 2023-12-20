package com.example.viajesDT.repository;

import com.example.viajesDT.dto.PasajeroDTO;
import com.example.viajesDT.entity.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPasajeroRepository extends JpaRepository<Pasajero, Long> {

    Pasajero findByDni(Integer dni);

    List<Pasajero> findAllByDni(Integer dni);
}
