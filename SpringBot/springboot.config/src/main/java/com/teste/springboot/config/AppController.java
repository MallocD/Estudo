package com.teste.springboot.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")//Cria Strings que possuam esse valor
    private String appMessage;

    @Value("${ENV_DB_URL:NEHUMA}")
    private String dbEnverionmentVariable;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }
    @GetMapping("/envariable")
    public String getDbEnverionmentVariable(){
        return "A seguinte váriavel de ambiente foi passada: " + dbEnverionmentVariable;
    }
}
