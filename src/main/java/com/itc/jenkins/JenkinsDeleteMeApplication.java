package com.itc.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDeleteMeApplication {
	
	 public static Logger logger= LoggerFactory.getLogger(JenkinsDeleteMeApplication.class);

	 @PostConstruct
	 public void init()
	 {
		 logger.info("Application started");
	 }
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDeleteMeApplication.class, args);
	}

}
