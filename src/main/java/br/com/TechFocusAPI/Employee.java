package br.com.TechFocusAPI;

import br.com.TechFocusAPI.EnumClass.Gender;
import br.com.TechFocusAPI.EnumClass.Role;

import java.text.DateFormat;

public class Employee {
    private int idEmployee;
    private int idSector;
    private String name;
    private String lastName;
    private String dateOfBirth;
    private String cpf;
    private String rg;
    private String adress;
    private double salary;
    private Role role;
    private Gender gender;

    public Employee(String name, String lastName, String dateOfBirth, String cpf, String rg, String adress, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.cpf = cpf;
        this.rg = rg;
        this.adress = adress;
        this.salary = salary;
        System.out.println("Criado");
    }
}
