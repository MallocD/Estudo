package com.nbs.simplificando.beans.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Livro {
    @Autowired
    Autor autor;

    private String nome;
    private String codigo;

    public void exibir(){
        autor.exibirAutor();
        System.out.println("Nome do livro : "+ nome + " Código: "+ codigo);
    }
}
