package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override	
	public void run(String... args) throws Exception {
		//TODO Auto-generated method stub
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "1121", "123123");
		User u2 = new User(null, "alex green", "aleax@gmail.com", "q2123123", "123131");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
