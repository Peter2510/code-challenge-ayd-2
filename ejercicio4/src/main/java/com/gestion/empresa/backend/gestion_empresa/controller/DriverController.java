package com.gestion.empresa.backend.gestion_empresa.controller;


import com.gestion.empresa.backend.gestion_empresa.model.Driver;
import com.gestion.empresa.backend.gestion_empresa.serviceImpl.DriverServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/*
    Author: peterg
    Created on: 6/03/25
*/
@RestController
@RequestMapping("/driver")
@RequiredArgsConstructor
public class DriverController {

    @Autowired
    private DriverServiceImpl driverServiceImpl;

    @GetMapping("/driver")
    public ResponseEntity<Map<String, Object>> getDrivers() {

        return ResponseEntity.status(200).body(Map.of("ok",true, "Drivers", driverServiceImpl.getAllDrivers()));

    }

    @PostMapping("/create-driver")
    public ResponseEntity<Map<String, Object>> createDriver(@RequestBody Driver driver) {
        if(driverServiceImpl.createDriver(driver).isPresent()){
            return ResponseEntity.status(200).body(Map.of("ok", true));
        }else{
            return ResponseEntity.status(200).body(Map.of("ok", false));
        }
    }

}
