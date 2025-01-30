package com.etms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etms.pojos.Manager;
import com.etms.pojos.Project;
import com.etms.repository.AdminRepository;
import com.etms.repository.ManagerRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
    private AdminRepository adminRepository; 
	@Autowired
	private ManagerRepository managerRepository;
	
	@Override
    public Manager createManager(Manager manager) {
        return managerRepository.save(manager);
    }
	
	@Override
    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }
	
	@Override
    public Project createProject(Project project) {
        return adminRepository.save(project);
    }
	
	
}
