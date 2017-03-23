package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBootApplication {

	public static void main(String[] args) {
        HelloPiProducer pi = new HelloPiProducer();
        System.out.println("PI = " + pi.GetPi());
		SpringApplication.run(HelloBootApplication.class, args);
	}
}
