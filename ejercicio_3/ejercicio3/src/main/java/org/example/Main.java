package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student a = new Student("h", "s");

        Department b = new Department();
        b.addStudent(a,2);

    }
}