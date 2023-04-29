package br.com.TechFocusAPI;

import br.com.TechFocusAPI.EnumClass.Gender;
import br.com.TechFocusAPI.EnumClass.Role;
import br.com.TechFocusAPI.RecorPac.AddEmployeeData;
import jakarta.persistence.*;
@Table(name="employee")
@Entity(name="Employee")
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode(of="idEmployee")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;
    private String name;
    private String last_name;
    private String date_of_birth;
    private String cpf;
    private String rg;
    private String adress;
    private double salary;
    @Enumerated private Role role;
    @Enumerated private Gender gender;

    public Employee(String name, String last_name, String date_of_birth, String cpf, String rg, String adress, double salary, Role role, Gender gender) {
        this.name = name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.cpf = cpf;
        this.rg = rg;
        this.adress = adress;
        this.salary = salary;
        this.role = role;
        this.gender = gender;
        System.out.println("Criado "+ name +" "+ last_name +" "+ date_of_birth +" "+ cpf +" "+ rg +" "+ adress +" "+ salary +" "+  role +" "+ gender);
    }

    public Employee(AddEmployeeData dados){
        this.name = dados.name();
        this.last_name = dados.last_name();
        this.date_of_birth = dados.date_of_birth();
        this.cpf = dados.cpf();
        this.rg = dados.rg();
        this.adress = dados.adress();
        this.salary = dados.salary();
        this.role = dados.role();
        this.gender = dados.gender();
    }
}
