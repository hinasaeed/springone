package com.example.springone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;

@SpringBootApplication
public class SpringoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringoneApplication.class, args);


	}

	@Bean
	public Function<String,String> uppercase(){
		return v ->{
			System.out.println("Uppercasing: " + v);
			return v.toUpperCase();
		};
	}

	//this will take a string, change it to all uppercase, and return the string.

	//now this app can listen to messages, process it and publish a message



}
