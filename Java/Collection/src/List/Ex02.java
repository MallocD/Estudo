package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        perguntas.add(scan.next());

        System.out.println("Estava no Local do crime?");
        perguntas.add(scan.next());

        System.out.println("Mora perto da vitima?");
        perguntas.add(scan.next());

        System.out.println("Devia para a vitima?");
        perguntas.add(scan.next());

        System.out.println("Ja trabalhou com a vitima?");
        perguntas.add(scan.next());

        Iterator<String> teste = perguntas.iterator();

        int s=0,n=0;

        while(teste.hasNext()){
            String ts = teste.next();
            if(ts.equalsIgnoreCase("S"))
                s++;
            else n++;
        }
        switch (s){
            case 1-> System.out.println("É Inocente");
            case 2-> System.out.println("Possível suspeito");
            case 3,4 -> System.out.println("Considerado cúmplice");
            default -> System.out.println("É o assasino");

        }
        /*if(s<2){
            System.out.println("Não é um suspeito");
        }else if(s<3){
            System.out.println("É um suspeito");
        }else if(s<5){
            System.out.println("Considerado cúmplice");
        }else{
            System.out.println("É o assasino");
        }*/

        System.out.println("Respostas Sim: " +s);
        System.out.println("Respostas Não: "+ n);


    }
}
