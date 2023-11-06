package com.example.viajesDT.repository;

import com.example.viajesDT.entity.ViajeChofer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IViajeChoferRepository extends JpaRepository<ViajeChofer,Long> {


    Optional<ViajeChofer> findByIdChofer(Long id);
}
