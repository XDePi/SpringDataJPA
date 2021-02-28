package ru.depi.datarest.data_spring_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.depi.datarest.data_spring_rest.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
