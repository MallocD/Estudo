package arrays.exe;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//instancia um novo objeto a partir da classe Scanner

        String[] cons = new String[6];//Instanciando um objeto array a partir de uma classe
        int quanT = 0;
        int c = 0;

        do{
            System.out.println("Letra : ");
            String l = scan.next();

            if ( !(l.equalsIgnoreCase("a")|//Chamdando o método equalsIgnoreCase do objeto String//equals= Igual//Ignore =Ignorar //Case= Maiusculo ou minusculo //Ira comparar o valor das duas Strings ignorando o case sensitive
             l.equalsIgnoreCase("e")|
             l.equalsIgnoreCase("i")|
             l.equalsIgnoreCase("o")|
             l.equalsIgnoreCase("u"))){
                cons[c] = l;
                quanT++;}

        c++;
        }while(c< cons.length);

        System.out.println("Consoantes: ");

        for(String conso : cons){
            if(conso!=null)
            System.out.println(conso);
        }//Lado esquerdo da : colocar o tipo da array com uma nova váriavel e do lado direito a array a ser lida, assim para cada elemento criado dentro do array o sout irá mostrar
        System.out.println("Quantidade de consoantes: "+ quanT);

    }
}
