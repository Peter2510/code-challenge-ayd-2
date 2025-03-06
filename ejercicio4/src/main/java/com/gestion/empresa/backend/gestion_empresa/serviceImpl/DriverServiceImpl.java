package com.gestion.empresa.backend.gestion_empresa.serviceImpl;


/*
    Author: peterg
    Created on: 6/03/25
*/

import com.gestion.empresa.backend.gestion_empresa.model.Driver;
import com.gestion.empresa.backend.gestion_empresa.repository.DriverRepository;
import com.gestion.empresa.backend.gestion_empresa.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Optional<Driver> createDriver(Driver driver) {
        //buscar
        if(driverRepository.findByName(driver.getName()).isEmpty()){
            return Optional.of(driverRepository.save(driver));
        }
        return Optional.empty();

    }

    @Override
    public Optional<Driver> findDriverByName(String name) {
        return driverRepository.findByName(name);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }


}
