package it.academy.java.sprint1.tasca5.n1exercisi5;

import java.io.Serializable;

public class Persona implements Serializable {
     String name;
     String surName;
     String dni;
     String cityOfBirth;

    public Persona(String name, String surName, String dni, String cityOfBirth) {
        this.name = name;
        this.surName = surName;
        this.dni = dni;
        this.cityOfBirth = cityOfBirth;
    }
}
