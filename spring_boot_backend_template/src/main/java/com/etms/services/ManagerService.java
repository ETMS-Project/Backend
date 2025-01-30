package com.etms.services;

import java.util.List;

import com.etms.pojos.Employee;
import com.etms.pojos.Manager;

public interface ManagerService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

	
	
}
