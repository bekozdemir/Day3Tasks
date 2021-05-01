
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() +"-"+ user.getEmail() + " eklendi.");
		
	}
	
	public void add2(UserManager userManager) {
		System.out.println("User added");
		userManager.list();
	}
	
	public void addMultipleUsers(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	public void list() {
		System.out.println("User listed");
	}
}
