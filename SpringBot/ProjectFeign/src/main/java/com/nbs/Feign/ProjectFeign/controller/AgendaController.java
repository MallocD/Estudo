package com.nbs.Feign.ProjectFeign.controller;

import com.nbs.Feign.ProjectFeign.agenda.Contato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AgendaController {
    @GetMapping("/contato")
    public Contato retornaContato(){
        return Contato.builder()
                .id(2L)
                .nome("Mic")
                .telefone("985y423f")
                .build();
    }
}
