package com.codelovin.springboot.sonarclouddemo;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarCloudDemoApplication {

	private static Logger logger = Logger.getLogger(SonarCloudDemoApplication.class.getName());
	
	public static void main(String[] args) {
		logger.info("HARD_CODED_STRING");
		SpringApplication.run(SonarCloudDemoApplication.class, args);
	}

}
