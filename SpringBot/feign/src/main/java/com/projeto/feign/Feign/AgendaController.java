package com.projeto.feign.Feign;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping()
    public Contato retornaContato(){
        System.out.println("Funcionando");
        return Contato.builder()
                .id(1l)
                .nome("Malloc")
                .telefone("9930-9939")
                .build();
    }
}
