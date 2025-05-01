package fas.ict.day07.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class session {
	@Id
	private String id;
	private Date date;
	private String name;
	private Time time;
	@ManyToOne
	private workshop workshop;
	@ManyToMany(mappedBy="sessions")
	private List<PostGraduate> postgraduates;
	@ManyToMany(mappedBy="sessions")
	private List<Presenter> presenters;
	@ManyToMany(mappedBy="sessions")
	private List<UnderGraduate> undergraduates;
}
