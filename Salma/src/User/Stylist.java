package User;

public class Stylist extends User {

	private String specialization;

	public Stylist(String UUID, String nama, String email, String password, String specialization) {
		super(UUID, nama, email, password);
		this.specialization = specialization;
	}
	
	
}
