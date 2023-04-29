package br.com.TechFocusAPI.RecorPac;

import br.com.TechFocusAPI.EnumClass.Gender;
import br.com.TechFocusAPI.EnumClass.Role;

public record AddEmployeeData(
        String name,
        String last_name,
        String date_of_birth,
        String cpf,
        String rg,
        String adress,
        double salary,
        Role role,
        Gender gender
) {
}
