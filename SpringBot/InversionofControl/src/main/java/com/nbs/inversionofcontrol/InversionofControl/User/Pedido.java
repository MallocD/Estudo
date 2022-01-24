package com.nbs.inversionofcontrol.InversionofControl.User;

import org.springframework.beans.factory.annotation.Autowired;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.gravar();
    }
    private EnviarEmails enviar = EnviarEmails.obterDadosemail();

    public void gravar(){
        enviar.retorna("Pedido Criado!");
    }
}
