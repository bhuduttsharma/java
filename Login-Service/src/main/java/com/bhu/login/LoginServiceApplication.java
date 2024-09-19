package com.bhu.login;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.bhu.login.entity.UserEntity;
import com.bhu.login.repo.UserRepo;

@SpringBootApplication
//@EnableDiscoveryClient
public class LoginServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginServiceApplication.class, args);
		System.out.println("login service started....");
	}
	
	 //Command line runner: After the application context, but before the application starts
    @Bean
    CommandLineRunner commandLineRunner(UserRepo userRepo, PasswordEncoder passwordEncoder){
        return args -> {
            UserEntity manager = new UserEntity();
            manager.setUsername("manager");
            manager.setPassword(passwordEncoder.encode("password"));
            manager.setRoles("ROLE_MANAGER");

            UserEntity admin = new UserEntity();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("password"));
            admin.setRoles("ROLE_MANAGER,ROLE_ADMIN");
            
            userRepo.saveAll(List.of(manager,admin));
        };
    }
}
