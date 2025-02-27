package org.example;


/*
    Author: peterg
    Created on: 27/02/25
*/

import java.util.HashMap;
import java.util.Map;

public class Department {

    private Map<Student, Integer> students = new HashMap<>();

    public void addStudent(Student student, int mark) {

        boolean encontrado = false;

        for (Map.Entry<Student, Integer> entry : students.entrySet()) {
            //el entryset es el los estudintes registrados y el map entry una entrada
            //evaluo a un estudiante
            Student existingEstudiante = entry.getKey();
            if (existingEstudiante.getLastName().equals(student.getLastName())) {
                encontrado = true;

                //elimar al estudiante encontrado
                students.remove(existingEstudiante);

                //agregar al estudiante
                addAStudent(student, mark);

                break;
            }
        }


        if (!encontrado) {
            addAStudent(student, mark);
        }
    }

    public void addAStudent(Student student, int mark) {
        students.put(student, mark);
    }

    public void printStudents() {
        for (Map.Entry<Student, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey().getName() + " " + entry.getValue());
        }
    }

    public int getSizeDepartment() {
        return students.size();
    }

}
