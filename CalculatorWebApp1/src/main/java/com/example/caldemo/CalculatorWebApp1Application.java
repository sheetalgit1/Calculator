package com.example.caldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.caldemo.repository.UserRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepo.class)
public class CalculatorWebApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorWebApp1Application.class, args);
	}

}
