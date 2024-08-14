package com.codeit.auth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginResource {
	
	@GetMapping("/")
	public String home(Authentication authentication) {
		System.out.println(authentication.getDetails());
		System.out.println(authentication.getPrincipal());
		return "Hello, Welcome ";
	}

}
