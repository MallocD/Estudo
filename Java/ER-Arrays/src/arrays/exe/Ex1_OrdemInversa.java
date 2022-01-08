package arrays.exe;
//Proposta : Criar um vetor de 6 números e mostrar na ordem inversa

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] n = {0,1,3,4,5,-2};

        /* for(int c = 0; (n.length > c); c++){
            System.out.println(n[c]);
        }*/
        for (int i : n) {
            System.out.println(i);
        }
        for(int x= (n.length-1);x>=0;x--){//Inverte a sequencia em que o número sera mostrado;
            System.out.print(n[x]+" ");
        }

    }
}
