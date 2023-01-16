package com.axis.saral.employeeservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.saral.employeeservice.entities.Employee;

@Repository
public interface employeeRepository extends CrudRepository<Employee,Long> {

}
