package Objetos;

import java.util.Scanner;

public class Estudar {
    String horario;
    int dia;
    String dificulde;

    public static void main(String[] args) {
        Estudar.materias();
    }


    private static void materias(){
        int cont = diaSemana();

        if(cont<8)
        System.out.print("As matérias de hoje são: ");

        switch (cont){
            case 1 -> System.out.println("Matematica");
            case 2 -> System.out.println("Portugues");
            case 3 -> System.out.println("Ingles");
            case 4 -> System.out.println("Espanhol");
            case 5 -> System.out.println("Python");
            case 6 -> System.out.println("Java");
            case 7 -> System.out.println("C++");
            default -> System.out.println("Data incorreta");
        }


    }
    private static  int diaSemana(){
        System.out.println("Escreva o dia de hoje em forma numérica: ");
        Estudar est = new Estudar();
        Scanner scan= new Scanner(System.in);
        est.dia= scan.nextInt();

        if(est.dia<8)
        System.out.print("Hoje é ");

        switch (est.dia){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Reveja o valor digitado, pois está incorreto!!");

        }
        return est.dia;
    }

}

