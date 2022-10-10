package com.nbs.Feign.ProjectFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFeignApplication.class, args);
		mostrar();

		}
	public static String mostrar(){
		return "Ola amigo";
	}


}
