package es.repeticao.ex;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String s = " x ";

        System.out.println("Qual número deseja saber o fatorial?");
        n= scan.nextInt();

        System.out.print(n+"! = " +n);

        for(int i=n-1; i>0;i--){
            n*=i;
            s+= i+" x ";

        }
        System.out.println(s+ "= "+ n);
    }
}
