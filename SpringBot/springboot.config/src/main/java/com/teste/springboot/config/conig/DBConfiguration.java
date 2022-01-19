package com.teste.springboot.config.conig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")//Mapeamento da configuração
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String usarname;
    private String passowrd;

    @Profile("dev")//Irá pegar as properties de dev
    @Bean
    public String testDataBaseConnection(){
        System.out.println("DB connection for DEV- H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }
    @Profile("prod")//Irá pegar as properties de dev
    @Bean
    public String productionDataBaseConnection(){
        System.out.println("DB connection for Production - MySQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MYSQL-PROD - Test instance";
    }



}
