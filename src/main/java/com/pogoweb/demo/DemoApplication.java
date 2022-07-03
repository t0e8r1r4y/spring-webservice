package com.pogoweb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication {

	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml,"
//			+ "/home/ec2-user/app/config/springboot-webservice/real-application.yml";
			+ "/Users/terryakishin/pogoweb/app/config/springboot-webservice/real-application.yml";

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class)
				.properties(APPLICATION_LOCATIONS)
				.run(args);
	}
}
