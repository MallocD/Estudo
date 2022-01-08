package es.repeticao.ex;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Quantos números deseja colocar?");
        int num= scan.nextInt();
        int[] n = new int[num];//Serve para caso eu quera mostrar os números
        int c= 0;
        int par= 0, impar=0;

        while(c<num) {//Enquanto o valor do contador for menor que o valor escolhido em num, o laço irá se repitir;

            System.out.println("Digite um número, caso deseje parar digite 0");
            n[c] = scan.nextInt();
            if(n[c]==0)break;//Se o valor escolhido for = 0  o break irá jogar pra fora do laço de repetição;

            if(n[c]%2==0)par++;//Se o resto do valor divido por 2 for = 0  o valor será par e caso contrário será par;
            else impar++;
            c++;
        }

        System.out.println("Números pares: "+ par);
        System.out.println("Números impares: "+ impar);

        
    }
}
