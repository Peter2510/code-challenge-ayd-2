package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createStudent(){
        Student st1 = new Student("Jose", "Longo");

        assertEquals("Jose", st1.getName());
        assertEquals("Longo", st1.getLastName());
    }





}