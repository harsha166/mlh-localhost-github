package com.axis.saral.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.axis.saral.employeeservice.entities.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private Employee employeeService;
	
	@GetMapping("/employee")
	public List<Employee> 
	getAllEmployees(){
	
	return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee
	getEmployeeByEmployeeId(@PathVariable long employeeId)
	{
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}
	
	@PostMapping("/employee")

		public ResponseEntity<String> saveEmployee(@RequestBody Employee employee)
		{
			employeeService.saveEmployee(employee);
			return new ResponseEntity<String>("Employee Id",HttpStatus.CREATED);
			
		}
	 @DeleteMapping("/employee/{employeeId}")
	 public ResponseEntity<String> deleteEmployeeByEmployeeId(@PathVariable long employeeId)
	 {
		 employeeService.deleteEmployeeByEmployeeId(employeeId);
		 return new ResponseEntity<String>("Employee Id deleted"+employeeId,HttpStatus.OK);
	 }
	}
	


