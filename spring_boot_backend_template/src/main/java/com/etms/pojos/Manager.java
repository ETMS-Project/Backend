package com.etms.pojos;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="managers")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true,exclude = {"projects","employees"})
public class Manager extends Person {
	
	@Column(name = "first_name", length = 20) // column name , varchar(20)
	private String firstName;
	
	@Column(name = "last_name", length = 20) // column name , varchar(20)
	private String lastName;
	
	
	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	
	
    @OneToMany(mappedBy = "manager") //don't add cascade as when manager is removed tranfer
    private List<Project> projects;// them to other manager

    @Override
    public String getRole(){
        return "MANAGER";
    }
   
    //helper method to add project
    public void addProject(Project project) {
    	this.projects.add(project);
    	project.setManager(this);
    }
    
    
}
