package com.codelovin.springboot.sonarclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarCloudDemoApplication {

	public static void main(String[] args) {
		System.out.println("HARD_CODED_STRING");
		SpringApplication.run(SonarCloudDemoApplication.class, args);
	}

}
