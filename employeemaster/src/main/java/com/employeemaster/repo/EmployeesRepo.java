package com.employeemaster.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeemaster.model.Employees;

public interface EmployeesRepo extends JpaRepository<Employees, Long>{

}
