package com.stackroute.uberservice;

import com.stackroute.uberservice.model.Greeting;
import com.stackroute.uberservice.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class UberApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberApplication.class, args);
	}

	@Bean
	public Function<User, Greeting> hello() {
		return user -> new Greeting("Welcome, " + user.getName());
	}

}
