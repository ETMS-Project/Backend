package com.etms.services;

import java.util.List;

import com.etms.pojos.Manager;
import com.etms.pojos.Project;

public interface AdminService {
	Manager createManager(Manager manager);

	List<Manager> getAllManagers();

	Project createProject(Project project);
}
