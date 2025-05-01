package fas.ict.day07.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int id;
	private String Pname;
	private long totalCost;
	@ManyToMany
	@JoinTable(name="project_assignments",
	joinColumns = @JoinColumn(name="pro_id"),
	inverseJoinColumns = @JoinColumn(name="emp_id"))
	private List<Employee> employees;
	
}
