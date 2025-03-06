package com.gestion.empresa.backend.gestion_empresa.repository;


/*
    Author: peterg
    Created on: 6/03/25
*/

import com.gestion.empresa.backend.gestion_empresa.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByName(String name);
}
