package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting Code!!");

//		User user = new User();
//		user.setFirstName ("Shaiz");
//		user.setLastName ("Mohammad");
//		user.setUsername("shaizmohammad");
//		user.setPassword(this.bCryptPasswordEncoder.encode("1234"));
//		user.setEmail("shaiz@gmail.com");
//		user.setPhone("1234567890");
//		user.setProfile("default.png");
//		Role rolel = new Role();
//		rolel.setRoleId(44L);
//		rolel. setRoleName ("ADMIN");
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole ();
//		userRole.setRole (rolel);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1 = this.userService. createUser(user, userRoleSet);
//		System.out.println(user1.getUsername ( ));



	}
}
