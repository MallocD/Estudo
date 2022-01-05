package alo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado:");
         int quadrado = returnTeste.area(scan.nextInt());
        System.out.println("Área do quadrado:" + quadrado);

        System.out.println("Digite os valores dos lados do retangulo:");
         float retangulo = returnTeste.area(scan.nextFloat(),scan.nextFloat());
        System.out.println("Área do retangulo:" + retangulo);

        System.out.println("Digite os valores da Base Maior, Base Menor e altura do trapézio:");
        double trapezio = returnTeste.area(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
        System.out.println("Área do trapézio: "  + trapezio);

        System.out.println("Digite os valores das diagonais do losango:");
        double losango = returnTeste.area(scan.nextDouble(),scan.nextDouble());
        System.out.println("Área do Losango: " + losango);
    }
}
