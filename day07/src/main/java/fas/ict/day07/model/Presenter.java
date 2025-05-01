package fas.ict.day07.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Presenter extends Persons{
	@Id
	private String id;
	private String affiliation;
	private String country;
	private String job_title;
	@ManyToMany
	@JoinTable(name="presenter_sessions",
	joinColumns=@JoinColumn(name="presenters_id"),
	inverseJoinColumns=@JoinColumn(name="sessions_id"))
	private List<session> sessions;
}
