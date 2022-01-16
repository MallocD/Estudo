package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temp = new ArrayList<Double>();

        int count = 0;
        while(true){
            if(count==6) break;
            System.out.println("Digite a temperatura do mês");
            double aux = scan.nextDouble();
            temp.add(aux);
            count++;
        }

        Iterator<Double> som = temp.iterator();
        Iterator<Double> s = temp.iterator();
        Iterator<Double> m = temp.iterator();

        double soma =0, media;

        while(som.hasNext()){
            double aux = som.next();
            soma+=aux;
        }
        media = soma/ temp.size();

        int quant =0, conta = 0;

        while(s.hasNext()){
            double mes = s.next();
            if(mes>=media)
                quant++;
        }

        System.out.println("Quantidade de meses acima da média: "+ quant);

        /*count =
        switch (som.hasNext()){

        }*/

        System.out.println("Temperaturas->" + temp);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Meses a cima da média");

        while(m.hasNext()){
            Double tem = m.next();
            if(tem> media){
                switch (conta){
                    case 0 -> System.out.println("Janeiro: "+ tem);
                    case 1 -> System.out.println("Fevereiro: "+ tem);
                    case 2 -> System.out.println("Março: "+ tem);
                    case 3 -> System.out.println("Abril: "+ tem);
                    case 4 -> System.out.println("Maio: "+ tem);
                    case 5 -> System.out.println("Junho: "+ tem);
                    default -> System.out.println("Não houve temperatura acima da média");

                }
            }
                conta++;
        }






    }
}
