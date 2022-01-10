package exercicios;

//Fazer um for para que mostre os números de 3 até 11, sendo que itere de 2 em 2,
//Quando o loop passsar pelo 7 o mesmo não deve ser exibido
public class For {
    public static void main(String[] args) {
        int a = 11;
        for(int i = 3;i<=a;i=i+2){
                if (i == 7)continue;
        System.out.println("Os :" + i);}


//Fazer um while que exiba um texto 5 vezes com uma expressão de controle e uma variável booleana.
        int c = 0;
        while(true){
            System.out.println("Hello");
            c++;
            if(c==5) break;

        }
    }
}

