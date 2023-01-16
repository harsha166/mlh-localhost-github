package com.axis.saral.employeeservice.Service;

import java.util.List;

import com.axis.saral.employeeservice.entities.Employee;

public interface employeeService {
	 Employee getEmployeeByEmployeeId(long employeeId);
	 List<Employee>getAllEmployees();
	 void saveEmployee(Employee employee);
	 void updateEmployee(long employeeId,Employee updateEmployee);
	 void deleteEmployeeByEmployeeId(long emplloyeeId);
	 
	

}
