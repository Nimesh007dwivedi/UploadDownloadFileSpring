package com.api.postgress.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import com.api.postgress.main.files.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
@EnableAutoConfiguration
@PropertySource(value = { "classpath:application.properties" })   
public class PostgressApiMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(PostgressApiMain.class);

	public static void main(String[] args) {	
		LOGGER.info("Starting SalenoAPIMain Service..!!");
		  SpringApplication.run(PostgressApiMain.class, args);
			
		
	}
	
	
	

	}

