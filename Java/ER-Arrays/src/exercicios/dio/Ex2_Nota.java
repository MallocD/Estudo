package exercicios.dio;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;


        System.out.println("Digite sua nota : ");
        nota = scan.nextInt();

        while (nota>10){//Enquanto essa condição for verdadeira o código abaixo irá se repitir.
            System.out.println("Nota inválida, Digte novamente:");
            nota =scan.nextInt();
        }
        // Segunda maneira feita por mim
       /* while(true){/A repitição será infinita pois está verdadeira, e nesse caso só irá parae com o comando break, em que irá sair do bloco, assim parando a repetição.
            System.out.println("Qual sua nota?");
            nota = scan.nextInt();
            if(nota <= 10)break;//Quando o valor digitado for menor ou igual a 10 o comando break irá sair do bloco(laço de repitição) e mostrar o sout;
            System.out.println("Digite corretamente a nota!!");
            System.out.println(" ");

        }*/
        System.out.println("Parabéns pela nota!!");

    }
}
