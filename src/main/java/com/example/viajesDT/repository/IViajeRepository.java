package com.example.viajesDT.repository;


import com.example.viajesDT.entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IViajeRepository extends JpaRepository<Viaje, Long> {


}
