package com.employeemaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeemaster.model.*;
import com.employeemaster.repo.EmployeesRepo;

@Service
public class EmployeesService {
@Autowired
EmployeesRepo empRepo;

public List<Employees> getAllEmployees(){
	return empRepo.findAll();
}

public Employees getEmployee(long lngEmpId) {
	return empRepo.findById(lngEmpId).get();
}

public Employees saveEmployee(Employees emp) {
	empRepo.save(emp);
	return emp;
}
public void deleteEmployee(long lngEmpId) {
	empRepo.deleteById(lngEmpId);
}

public Employees updateEmployee(long lngEmpId,String strFirstName) {
	Employees emp = empRepo.findById(lngEmpId).get();
	emp.setStrFirstName(strFirstName);
	empRepo.save(emp);
	return emp;
}
}