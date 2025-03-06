package com.gestion.empresa.backend.gestion_empresa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    Author: peterg
    Created on: 6/03/25
*/
@Entity
@Table(name="driver")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "driver", nullable = false, length = 200)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;
}
