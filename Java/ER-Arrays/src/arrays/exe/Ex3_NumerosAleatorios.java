package arrays.exe;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random rand = new Random(); //Instanciando um novo objeto a partir da classe Random da classe util do java

        int[] numAleatorios = new int [20];

        for(int i= 0; i< numAleatorios.length; i++){
            int num = rand.nextInt(100);
            numAleatorios[i] = num;
        }
        System.out.print("Números gerados: ");
        for (int c:numAleatorios) {
            System.out.print(c + " ");

        }
        System.out.print("\nSucessores dos números gerados :");
    for(int c:numAleatorios) {
            System.out.print((c+1)+ " ");

        }System.out.print("\nAntecessor dos números gerados :");
    for(int c:numAleatorios) {
            System.out.print((c-1)+ " ");

        }
    }
}
