package com.example.viajesDT.repository;


import com.example.viajesDT.model.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViaje extends JpaRepository<Viaje, Long> {
}
