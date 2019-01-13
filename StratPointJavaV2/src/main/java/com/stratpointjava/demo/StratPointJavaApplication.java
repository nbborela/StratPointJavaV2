package com.stratpointjava.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StratPointJavaApplication extends SpringBootServletInitializer{
	
	private static final Logger log = LoggerFactory.getLogger(StratPointJavaApplication.class);
	
	public static void main(String[] args) {		
		SpringApplication.run(StratPointJavaApplication.class, args);
		log.info("StratPoint Started");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(StratPointJavaApplication.class);
		
	}
}

