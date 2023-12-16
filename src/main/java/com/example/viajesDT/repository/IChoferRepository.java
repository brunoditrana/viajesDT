package com.example.viajesDT.repository;

import com.example.viajesDT.dto.ChoferDTO;
import com.example.viajesDT.entity.Chofer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChoferRepository extends JpaRepository<Chofer, Long> {


    Chofer findByDni(Integer id);
}
