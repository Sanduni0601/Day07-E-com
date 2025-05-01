package fas.ict.day07.model;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Persons {
	private String email;
	private String gender;
	private String name;
	private int phone;
}
