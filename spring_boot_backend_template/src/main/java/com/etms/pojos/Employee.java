package com.etms.pojos;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employees")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true, exclude = {"manager","tasks"})
public class Employee extends Person {
	  @ManyToOne  //owing side foreign key to manager
	  @JoinColumn(name = "manager_id",nullable = false)
	    private Manager manager;

	  @OneToMany(mappedBy = "employee")  //employee can have multiple tasks
	  private List<Task> tasks;
	  
	  //helper method to add tasks
	  public void addTask(Task task) {
		  this.tasks.add(task);
		  task.setEmployee(this);
	  }
}
