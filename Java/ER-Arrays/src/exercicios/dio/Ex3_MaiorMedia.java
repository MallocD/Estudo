package exercicios.dio;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] n=new float[5];
        int c=0;
        float maior=0;
        float soma = 0;

        while (c<5){
            System.out.println("Informe um número");
            n[c]= scan.nextFloat();
            soma+=n[c];
            if(n[c]>maior) maior=n[c];
            c++;
        }

        for(c=0;c<5;c++){
            System.out.println("Valor "+ c + " : " +n[c]);
        }

        System.out.println("Maior número é: " + maior);
        System.out.println("A média dos valores é: "+ soma/5);
    }
}
