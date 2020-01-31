package com.afro.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.afro.employee.model.Employee;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
