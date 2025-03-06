package com.gestion.empresa.backend.gestion_empresa.service;


import com.gestion.empresa.backend.gestion_empresa.model.Driver;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
    Author: peterg
    Created on: 6/03/25
*/
@Service
public interface DriverService {

    Optional<Driver> createDriver(Driver driver);

    Optional<Driver> findDriverByName(String name);

    List<Driver> getAllDrivers();
}
