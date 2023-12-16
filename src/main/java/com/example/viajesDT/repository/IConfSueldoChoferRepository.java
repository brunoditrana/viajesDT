package com.example.viajesDT.repository;


import com.example.viajesDT.entity.ConfSueldoChofer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConfSueldoChoferRepository extends JpaRepository<ConfSueldoChofer,Long> {
}
