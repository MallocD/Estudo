package com.feign.Feign;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contato {

    private long id;
    private String nome;
    private String telefone;

}
