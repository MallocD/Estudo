package com.terceira.demo;

public class EnviarEmail {

    public EnviarEmail(String tipo, String endereco, String senha ) {
    }

    public static EnviarEmail obterDadosEmail(){
        return new EnviarEmail("stmn","Contato@dev.com","senha");
    }
    public void retorna(String mensagem){
        System.out.println("Email enviado!");

    }
}
