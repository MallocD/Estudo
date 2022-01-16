package set;

import java.util.*;

public class ExemplosSet {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(8d,7.8,5.5,9d,10d,8.7,10d));//Dentro do parametro informa que é uma lista seta os valores
        System.out.println(notas);
        System.out.println(notas.contains(10d));
        System.out.println("Exibir menor nota: " + Collections.min(notas));//Verificar a menor nota utilizando o Objeto da classe Collections

        System.out.println("Exibir menor nota: " + Collections.max(notas));//Verificar a maior nota utilizando o Objeto da classe Collections
    }
}

       /* System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

//        System.out.println("Exiba a terceira nota adicionada: ");

                System.out.println("Exiba a menor nota: " + Collections.min(notas));

                System.out.println("Exiba a maior nota: " + Collections.max(notas));

                Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

//        System.out.println("Remova a nota da posição 0");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
        Double next = iterator1.next();
        if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

        }
        }*/