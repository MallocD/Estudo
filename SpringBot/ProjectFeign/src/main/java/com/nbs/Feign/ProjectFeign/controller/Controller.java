package com.nbs.Feign.ProjectFeign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String basic(){
        return "Bem Vindo ao Site";
    }
}
