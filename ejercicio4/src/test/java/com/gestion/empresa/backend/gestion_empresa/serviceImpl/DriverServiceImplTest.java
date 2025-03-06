package com.gestion.empresa.backend.gestion_empresa.serviceImpl;

import com.gestion.empresa.backend.gestion_empresa.model.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DriverServiceImplTest {

    @Mock
    private DriverServiceImpl driverServiceImpl;

    private Driver driver;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        driver = new Driver();
    }


    @Test
    void saveANewDriverCorrect(){
        driver.setId(1);
        driver.setName("Rick");
        driver.setAge(15);

        when(driverServiceImpl.createDriver(driver)).thenReturn(Optional.of(driver));

        Optional<Driver> result = driverServiceImpl.createDriver(driver);

        assertEquals("Rick", result.get().getName());

    }

    @Test
    void saveANewDriverFail(){
        driver.setId(1);
        driver.setName("Rick");
        driver.setAge(15);

        when(driverServiceImpl.createDriver(driver)).thenReturn(Optional.empty());

        Optional<Driver> result = driverServiceImpl.createDriver(driver);

        assertEquals(Optional.empty(), result);

    }

}