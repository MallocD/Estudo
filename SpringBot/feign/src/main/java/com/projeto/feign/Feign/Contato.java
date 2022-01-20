package com.projeto.feign.Feign;

import lombok.Builder;
import lombok.Data;


@Data//Conjunto de anotações de getter and setters
@Builder
public class Contato {

    private long id;
    private String nome;
    private String telefone;

}
