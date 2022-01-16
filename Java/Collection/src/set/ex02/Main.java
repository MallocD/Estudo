package set.ex02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int c = 0;

        Set<LinguagemF> dev = new LinkedHashSet<>();
        System.out.println("Informações sobre sua carreira como programador\n");

    while(true){
        System.out.println("Pessoa "+ (c+1) + " : ");
        System.out.println("Informe sua Linguaguem favorita/" +
                " A IDE que você Utiliza / O ano de Criação da sua Linguagem Favorita  ");
        dev.add(new LinguagemF(scan.next(), scan.next(), scan.nextInt()));
        c++;
        if(c==3)break;
    }
        System.out.println(dev);

        System.out.println("Ordem Natural");

        Set<LinguagemF> nat = new TreeSet<>(dev);

        System.out.println(nat);





    }
}
