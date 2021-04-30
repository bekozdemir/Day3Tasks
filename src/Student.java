
public class Student extends User {
	private String certificatesAchieved;
	private String nationalIdentity;
	
	public Student() {
		
	}

	public Student(String certificatesAchieved, String nationalIdentity) {
		super();
		this.certificatesAchieved = certificatesAchieved;
		this.nationalIdentity = nationalIdentity;
	}

	public String getCertificatesAchieved() {
		return certificatesAchieved;
	}

	public void setCertificatesAchieved(String certificatesAchieved) {
		this.certificatesAchieved = certificatesAchieved;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
}
