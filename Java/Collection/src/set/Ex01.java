package set;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<ArcoIris> cor = new HashSet<>();

            System.out.println("Digite as cores do arco iris: \n " );
        int c = 0;
        while(true) {
            System.out.println("Cor " + (c + 1) + " : ");
            cor.add(new ArcoIris(scan.nextLine()));
            c++;
            if(c==3) break;

        }
        System.out.println("===ARCO IRIS===");
        System.out.println(cor);
        System.out.println(cor.size());

        System.out.println("Cores em ordem alfabética\n");

        Set<ArcoIris> ordem = new TreeSet<>(cor);
        System.out.println(ordem);

        System.out.println("Cores inversa a ordem alfabética\n");

        List<ArcoIris> inversa = new ArrayList<>(ordem);

        Collections.reverse(inversa);//metodo da classe collection que inverte a ordem que foi passada
        System.out.println(inversa);

        System.out.println("Cores que começam com V");

        /*System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);//é um método do objeto String
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();//é um método do objeto String
        }
        System.out.println(coresArcoIris);*/




    }
}

 class ArcoIris implements Comparable<ArcoIris>{
    private String cor;

     public ArcoIris(String cor) {
         this.cor = cor;
     }

     public String getCor() {
         return cor;
     }

     public void setCor(String cor) {
         this.cor = cor;
     }

     @Override
     public int compareTo(ArcoIris o) {
         return this.cor.compareTo(o.getCor());
     }

     @Override
     public String toString() {
         return "\n" +
                 "\n Cor " + cor;
     }
 }