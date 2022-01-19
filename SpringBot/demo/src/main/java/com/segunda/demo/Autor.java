package com.segunda.demo;

public class Autor implements AutorLivro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirAutor(){
        System.out.println("Nome do autor: " + nome);
    }
}
