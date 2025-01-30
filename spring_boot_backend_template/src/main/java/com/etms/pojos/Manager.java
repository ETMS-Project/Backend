package com.etms.pojos;

import java.util.List;


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
