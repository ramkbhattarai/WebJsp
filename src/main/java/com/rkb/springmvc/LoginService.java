package com.rkb.springmvc;

public class LoginService {
	
	public boolean isValid(String name, String password) {
		if(name.equals("ramkb") && password.equals("rkb")) return true;
		return false;
	}
}
