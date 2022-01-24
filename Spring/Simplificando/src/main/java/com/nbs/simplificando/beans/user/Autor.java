package com.nbs.simplificando.beans.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autor implements AutorLivro {
    private String nome;

    public void exibirAutor(){
        System.out.println("Autor do livro: " + getNome());
    }

}
