package com.terceira.demo;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.gravar();

    }
    private EnviarEmail enviar = EnviarEmail.obterDadosEmail();

    public void gravar(){
        enviar.retorna("Pedido criado!");
    }

}
