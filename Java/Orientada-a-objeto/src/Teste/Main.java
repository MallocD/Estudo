package Teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Copo cop = new Copo();

        System.out.println("Qual a cor do copo?");
        cop.cor = scan.next();

        System.out.println("Qual a capacidade de líquido do copo?");
        cop.capacidade = scan.nextInt();

        System.out.println("Qual a marca do copo?");
        cop.marca= scan.next();

        System.out.println("Qual a quantidade de bebida atualmente em seu copo?");
        cop.volume = scan.nextInt();


        cop.tamparCopo();
        cop.encherCopo();

        if(cop.capacidade>cop.volume)
        cop.d = scan.nextInt();
        cop.colocarBebida();

        System.out.println("------------------");
        cop.situacaoCopo();

        int i[] ={1, 2, 3, 4};

    }
}
