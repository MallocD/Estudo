package exercicios.dio;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;


        do
        {//A repitição será infinita pois está verdadeira, e nesse caso só irá parae com o comando break, em que irá sair do bloco, assim parando a repetição.
            System.out.println("Qual o nome?");
            nome = scan.next();

            System.out.println("Qual a idade?");
            idade = scan.nextInt();
        } while (!nome.equals("0"));

        System.out.println("Ola");


    }
}
          /*  while(true){//A repitição será infinita pois está verdadeira, e nesse caso só irá parae com o comando break, em que irá sair do bloco, assim parando a repetição.
                System.out.println("Qual o nome?");
                nome = scan.next();

                System.out.println("Qual a idade?");
                idade = scan.nextInt();
                if (nome.equals("0")) break;//Se o nome for igual a 0 o comando break irá fazer com que saia do laço e pare a repetição.*/
