package com.example.dsa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("dsa coding");
	}
}
