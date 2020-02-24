package com.rkb.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;// = new LoginService();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@ResponseBody
	public String toLogin() {
		return "login";
				
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String toWelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(!loginService.isValid(name, password)) {
			model.put("error", "hey they don't match check again");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
				
	}
}
