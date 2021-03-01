package ru.depi.datarest.data_spring_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.depi.datarest.data_spring_rest.entity.Employee;
import ru.depi.datarest.data_spring_rest.repository.EmployeeRepository;

import java.util.List;

/**
 * @author DePi
 **/

@RestController
public class MyController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees/name/{name}")
    public List<Employee> findByName(@PathVariable String name) {
        List<Employee> byName = employeeRepository.findByName(name);
        return byName;
    }
}
