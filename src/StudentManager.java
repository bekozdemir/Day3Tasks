
public class StudentManager extends UserManager{
	public void addAchievedCertificate(String AchievedCertificate) {
		System.out.println(AchievedCertificate + " sertifikasý eklendi");
	}
	
	@Override
	public void list() {
		System.out.println("Students listed");
	}
}

