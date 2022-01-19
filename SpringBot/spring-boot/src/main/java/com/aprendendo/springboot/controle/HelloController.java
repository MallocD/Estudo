package com.aprendendo.springboot.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Converter o valor para JSON
public class HelloController {

    @GetMapping("/")//Comando que faz com que o valor retorne
    public String helloMessage(){
        return "Hello, Confio em você";
    }

}
