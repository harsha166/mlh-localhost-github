package com.axis.saral.employeeservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.axis.saral.employeeservice.repository.employeeRepository;
import com.axis.saral.employeeservice.entities.Employee;

public class employeeServiceImpl<EmployeeRepository> implements employeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public Employee getEmployeeByEmployeeId(long employeeId) {
		
		return ( employeeRepository).findByEmployeeId(employeeId).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(long employeeId, Employee updateEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeByEmployeeId(long emplloyeeId) {
		// TODO Auto-generated method stub
		
	}

}
