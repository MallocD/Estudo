package arrays.exe;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random rand  = new Random();

        int [][]M = new int[4][4];

        for(int i = 0; i<M.length; i++){
            for(int x = 0; x<M[i].length;x++){
                M[i][x] = rand.nextInt(9);
            }
        }
        System.out.println("Matriz :");
        for (int[] linha : M) {
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
