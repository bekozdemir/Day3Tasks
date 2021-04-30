
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() +"-"+ user.getEmail() + " eklendi.");
	}
	
	public void addMultipleUsers(User[] users) {
		for (User user : users) {
			addUser(user);
		}
	}
}
