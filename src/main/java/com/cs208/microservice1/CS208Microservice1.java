package com.cs208.microservice1;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses = Handler.class)
public class CS208Microservice1 {

	@Value("${PORT:8081}")
	String port;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CS208Microservice1.class);
		CS208Microservice1 cs208Microservice1 = new CS208Microservice1();
		cs208Microservice1.init(app, args);
	}
	
	private void init(SpringApplication app, String[] args) {
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", port));
		app.run(args);
	}

}
