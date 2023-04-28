package br.com.TechFocusAPI;

import br.com.TechFocusAPI.EnumClass.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class TechFocusApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechFocusApiApplication.class, args);
	}

	Employee emplo = new Employee("Marco",
			"Castellani",
			"1995-07-26",
			"439.311.428-09",
			"45.605.810-2",
			"Jose Cairos de Freitas - 252",
			5000.0 );

	Role role = Role.valueOf("Marceneiro Nv1");
	Role role2 = Role.ANALISTA_DE_RH;



}
