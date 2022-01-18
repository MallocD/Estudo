package one;

import java.util.Scanner;

public class Testte {
    public static void main(String[] args) {
        /*    System.out.println("-------------------------------------");
            System.out.println("");
            System.out.println("|                                   |");
            System.out.println("");
            System.out.println("|                                   |");
            System.out.println("");
            System.out.println("|                                   |");
            System.out.println("");
            System.out.println("|                                   |");
            System.out.println("");
            System.out.println("-------------------------------------");
        }*/

        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int[] num = new int[5];
        num[0] = leitor.nextInt();
        num[1] = leitor.nextInt();
        num[2] =  leitor.nextInt();
        num[3] =  leitor.nextInt();
        num[4] =  leitor.nextInt();

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

//continue a solução
        for (int i = 0; i<5;i++) {
            if(num[i]%2==0){
                par++;
                positivo++;
            }else if(num[i]%2!=0 && num[i]>0){
                impar++;
                positivo++;
            }else if(num[i]<0){
                negativo++;
            }

        }
//insira suas variaveis corretamente
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
    }

}


