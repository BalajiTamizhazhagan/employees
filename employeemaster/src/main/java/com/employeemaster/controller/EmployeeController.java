package com.employeemaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemaster.model.Employees;
import com.employeemaster.service.EmployeesService;

@RestController
public class EmployeeController {
@Autowired
EmployeesService empSer;

@GetMapping("/employees")
private List<Employees> getAllEmployees(){
	return empSer.getAllEmployees();
}

@GetMapping("/employees/{user_id}")
private Employees getEmployee(@PathVariable("user_id") long lngEmpId) {
	return empSer.getEmployee(lngEmpId);
}

@DeleteMapping("/employees/{user_id}")
@ResponseBody
private String deleteEmployee(@PathVariable("user_id") long lngEmpId) {
	empSer.deleteEmployee(lngEmpId);
	return "User Deleted Successfully"; 
}

@PatchMapping("/employees/{user_id}/{firstname}")
private Employees updateEmployee(@PathVariable("user_id") long lngEmpId,
								 @PathVariable("firstname") String strFirstName) {
	return empSer.updateEmployee(lngEmpId,strFirstName);
	
}

@PostMapping("/employees")
private Employees saveEmployee(Employees emp) {
	System.out.println(emp.toString());
	return empSer.saveEmployee(emp);
}
}
