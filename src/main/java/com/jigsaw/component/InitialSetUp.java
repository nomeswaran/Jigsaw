package com.jigsaw.component;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class InitialSetUp {

	
	public static Map<String,String> users = new HashMap<>();
	
	@PostConstruct
	void init(){
		
		System.out.println("done users set up.");
		users.put("nomeswaran", "nomeswaran");
		users.put("admin", "admin");
		users.put("user1", "user1");
	}
}
