package com.example.viajesDT.repository;

import com.example.viajesDT.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculo extends JpaRepository<Vehiculo, Long> {
}
