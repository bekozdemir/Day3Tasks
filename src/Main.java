
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
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
		userManager.list();
		userManager.add2(new StudentManager());
		
		System.out.println("-------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCertificate("MCT");
		instructorManager.list();
		instructorManager.add(berkay2);
		instructorManager.add2(new InstructorManager());
		
		System.out.println("-------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addAchievedCertificate("C# & Angular");
		studentManager.list();
		
		
	}

}
