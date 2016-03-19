package com.jigsaw.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jigsaw.component.InitialSetUp;
import com.jigsaw.model.User;

@Controller
@Scope("session")
public class HomeController {
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String welcome() {

		return "signin";

	}
	
	@RequestMapping(value = "/login_process", method = RequestMethod.POST)
	public String loginProcess(HttpServletRequest req,@RequestParam(value="username", required=false) String username, 
	        @RequestParam(value="password", required=false) String password, ModelMap model) {

		
		System.out.println(username + "   "+password);
		
		String passcode = InitialSetUp.users.get(username);
		
		if(null != passcode && passcode.equals(password)){
			req.getSession().setAttribute("user",new User(username));
		return "userHome";
		}else{
			model.put("msg", "Invalid user detail");
			return "signin";
		}

	}
	
	
	
	

}
