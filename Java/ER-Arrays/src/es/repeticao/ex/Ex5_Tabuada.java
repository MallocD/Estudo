package es.repeticao.ex;



import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero,n;

        System.out.println("Digite um número para sua tabuada: ");
        numero= scan.nextInt();

        for(int c=1;c<11;c++){
            System.out.println(numero+ " X "+ c + " = " + (numero*c));
        }
    }

}
