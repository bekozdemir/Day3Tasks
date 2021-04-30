
public class Instructor extends User {
	private String certificates;
	private String courses;
	
	public Instructor() {
		
	}
	
	public Instructor(String certificates, String courses) {
		super();
		this.certificates = certificates;
		this.courses = courses;
	}

	public String getCertificates() {
		return certificates;
	}

	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

}
