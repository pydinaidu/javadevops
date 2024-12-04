package com.app;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.app.starter.CustomProperties;
@EnableConfigurationProperties(CustomProperties.class)
@SpringBootApplication
public class AppApplication  {
	

	 
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}


}
