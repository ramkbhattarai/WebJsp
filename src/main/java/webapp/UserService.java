package webapp;

public class UserService {
	
	public boolean isValid(String name, String password) {
		if(name.equals("ramkb") && password.equals("rkb")) return true;
		return false;
	}
}
