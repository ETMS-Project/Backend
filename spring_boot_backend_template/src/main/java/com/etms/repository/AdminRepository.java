package com.etms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etms.pojos.Admin;
import com.etms.pojos.Project;

public interface AdminRepository extends JpaRepository<Admin, Long>{

	Project save(Project project);

}
