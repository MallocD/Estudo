package com.nbs.dependencyInjection.dependencyInjection.modelos;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {
    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();

    }
    @Autowired
    private Veiculos veiculos;

    public Condutor(Veiculos obj){
        this.veiculos= obj;
    }

    public void automovel(){
        veiculos.acao();
    }
}
