package com.axis.saral.employeeservice.entities;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	

	private long employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String emailId;
	private long mobileNumber;
	private String dateOfJoining;
	private String designation;
	private long projectId;
	private String projectTitle;
	private long salary;
	
	
	
	public Employee(long EmployeeId,String firstName, String middleName, String lastName, String dateOfBirth,String emailId, long mobileNumber,String dateOfJoining, String designation,long projectId,String projectTitle, String Salary) {
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.emailId=emailId;
		this.mobileNumber=mobileNumber;
		this.dateOfJoining=dateOfJoining;
		this.designation=designation;
		this.projectId=projectId;
		this.projectTitle=projectTitle;
		this.salary=salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString()
	{
		return "Employee[employee Id="+employeeId+",first name=" +firstName+",middle name="+middleName+",last name="+lastName+",date of birth="+dateOfBirth+", emaild id="+emailId+",mobile number="+mobileNumber+",date of joining="+dateOfJoining+",designation="+designation+",project id="+projectId+",project title="+projectTitle+",salary="+salary+" ]";
	}
	public List<Employee> getAllEmployees() {
		
		return null;
	}
	public Employee getEmployeeByEmployeeId(long employeeId) {
		
		return null;
	}
	public void saveEmployee(Employee employee) {
	
		
	}
	public void deleteEmployeeByEmployeeId(long employeeId) {
		
		
	}

}
