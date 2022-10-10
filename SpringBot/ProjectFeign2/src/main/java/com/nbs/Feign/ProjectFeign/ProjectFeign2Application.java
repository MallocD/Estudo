package com.nbs.Feign.ProjectFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProjectFeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFeign2Application.class, args);
	}

}
