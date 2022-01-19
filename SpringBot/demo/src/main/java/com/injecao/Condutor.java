package com.injecao;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {
    public static void main(String[] args) {
        Condutor cond = new Condutor(new Carro());
        cond.automovel();

    }
    @Autowired
    private Veiculo veiculo;

    public Condutor (Veiculo obj){
        this.veiculo = obj;
    }

    public void automovel(){
        veiculo.acao();
    }
}
