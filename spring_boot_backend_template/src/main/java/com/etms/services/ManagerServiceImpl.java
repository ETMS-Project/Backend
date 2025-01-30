package com.etms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etms.pojos.Employee;
import com.etms.pojos.Manager;
import com.etms.repository.EmployeeRepository;
import com.etms.repository.ManagerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepository managerRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
}
