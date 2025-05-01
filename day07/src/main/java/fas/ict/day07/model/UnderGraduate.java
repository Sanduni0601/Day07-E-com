package fas.ict.day07.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class UnderGraduate extends Persons{
	@Id
	private String id;
	private String university;
	@ManyToMany
	@JoinTable(name="under_graduate_sessions",
	joinColumns=@JoinColumn(name="under_graduates_id"),
	inverseJoinColumns=@JoinColumn(name="sessions_id"))
	private List<session> sessions;
}

