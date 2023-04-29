package br.com.TechFocusAPI.Controller;

import br.com.TechFocusAPI.Employee;
import br.com.TechFocusAPI.RecorPac.AddEmployeeData;
import br.com.TechFocusAPI.Repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @PostMapping
    @Transactional
    public void addNewEmployee(@RequestBody AddEmployeeData dadosEmployee){
        repository.save(new Employee(dadosEmployee));
    }

}
