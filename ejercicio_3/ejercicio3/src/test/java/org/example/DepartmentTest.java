package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Student s1;
    Student s2;

    Department department;
    @BeforeEach
    void setUp() {
        s1 = new Student("Jose", "Milla");
        s2 = new Student("Fer", "Koke");

        department = new Department();
        department.addStudent(s1,72);
        department.addStudent(s2,45);
    }

    @Test
    void agregarEstudianteCorrectamente() {
        Student s3 = new Student("Elizabeth", "Arreaga");

        department.addStudent(s3,72);
        assertEquals(3, department.getSizeDepartment());

    }

    @Test
    void reemplazarEstudianteConApellidoYaRegistrado() {
        Student s4 = new Student("Mario", "Koke");

        department.addStudent(s4,85);
        assertEquals(2, department.getSizeDepartment());

    }

    @Test
    void imprimirEstudiantesRegistradosInicialmente(){
        department.printStudents();
    }

    @Test
    void imprimirEstudiantesRegistradosCorrectamenteDespues(){
        Student s4 = new Student("Mario", "Koke");
        Student s5 = new Student("Mario", "Koke");

        department.addStudent(s4,85);
        department.addStudent(s5,85);


        department.printStudents();

    }


}