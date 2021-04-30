
public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		engin.setCertificates("MCT,PMP,ITIL");
		engin.setFirstName("Engin");
		engin.setLastName("Demiroð");
		engin.setEmail("engin@engin.com");
		
		Student berkay = new Student();
		berkay.setCertificatesAchieved("C# & Angular");
		
		User berkay2 = new User();
		berkay2.setId(1);
		berkay2.setFirstName("Berkay");
		berkay2.setLastName("Özdemir");
		berkay2.setEmail("brkyzdmr@gmail.com");
		
		User[] users = {engin, berkay2};
		
		UserManager userManager = new UserManager();
		userManager.addMultipleUsers(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCertificate("MCT");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addAchievedCertificate("C# & Angular");
		
		
	}

}
