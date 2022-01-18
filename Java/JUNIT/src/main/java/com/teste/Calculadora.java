package com.teste;

public class Calculadora {

    public int somar(String expressao) {
        int soma = 0;
        for (String valorasoma : expressao.split("\\+"))
            soma += Integer.valueOf(valorasoma);
            System.out.println(soma);

            return soma;
    }
}
