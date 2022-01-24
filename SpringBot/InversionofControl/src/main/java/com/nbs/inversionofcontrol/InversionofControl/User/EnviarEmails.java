package com.nbs.inversionofcontrol.InversionofControl.User;

import org.springframework.stereotype.Component;

@Component
public class EnviarEmails {
    public EnviarEmails(String tipo, String endereco, String senha){
    }
    public static EnviarEmails obterDadosemail(){
        return new EnviarEmails("stmp","joao@gmai.com","9300h");
    }
    public void retorna(String mensagem){
        System.out.println("Email enviado");
    }


}
