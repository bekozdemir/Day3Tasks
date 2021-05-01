
public class InstructorManager extends UserManager{
	public void addCertificate(String certificate) {
		System.out.println(certificate + " sertifikasý eklendi");
	}
	
	public void addCourse(String course) {
		System.out.println(course + " kursu eklendi");
	}
	
	@Override
	public void list() {
		System.out.println("Instructors listed");
	}
}
