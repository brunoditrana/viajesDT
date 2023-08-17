package com.example.viajesDT.repository;

import com.example.viajesDT.entity.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPasajero extends JpaRepository<Pasajero, Long> {
}
