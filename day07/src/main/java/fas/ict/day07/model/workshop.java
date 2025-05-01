package fas.ict.day07.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class workshop {
	@Id
	private int id;
	private String description;
	private Date end_date;
	private String name;
	private Date start_date;
	@OneToMany(mappedBy="workshop")
	private List<session> sessions;
}
