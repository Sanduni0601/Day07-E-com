package fas.ict.day07.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee extends Person {
	@Id
	private String empNo;
	private String name;
	private int age;
	
	private double salary;
	private String gender;
	@ManyToOne
	private Department department; // Many employees to one department
	
	@ManyToMany(mappedBy="employees")// Employee can work on many projects
	private List<Project> projects;
}

