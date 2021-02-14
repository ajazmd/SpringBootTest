package com.git;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {
	private static Logger logger=LoggerFactory.getLogger(SpringBootTestApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootTestApplication.class, args);
		logger.info("New Modification");
		logger.error("why this error");
		logger.warn("Already defined object");
		System.out.println("This is for git to test the code");
	}

}
