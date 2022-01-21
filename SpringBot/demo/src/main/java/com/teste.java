package com;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        int nota1 = scan.nextInt();
        System.out.println("Informe a segunda nota:");
        int nota2 = scan.nextInt();

        float media = (nota1+nota2)/2;

        System.out.println("Media dos alunos "+ media);
    }
}
