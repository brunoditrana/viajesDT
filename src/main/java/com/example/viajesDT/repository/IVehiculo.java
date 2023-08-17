package com.example.viajesDT.repository;

import com.example.viajesDT.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculo extends JpaRepository<Vehiculo, Long> {
}
