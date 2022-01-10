package com.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        int a= 1;
        int b = a;

        System.out.println("Int a = "+ a + " int b = " + b);
        a = 3;//*Com tipo primitivo, copiamos o valor em memória;
        System.out.println("Int a = "+ a + " int b = " + b);

        MeuObjt objA = new MeuObjt(1);
        MeuObjt objB = objA;//*Com objetos copiamos o valor da referência em memória sem duplicar o objeto;
        System.out.println("objA = "+ objA + " objB = " + objB);
        objA.setNum(3);//Atribui ao valor aos dois tanto objB quanto objA
        System.out.println("objA = "+ objA + " objB = " + objB);


    }
}
