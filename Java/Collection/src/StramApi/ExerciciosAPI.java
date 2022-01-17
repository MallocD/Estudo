package StramApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosAPI {
    public static void main(String[] args) {

        List<String> numerosAle= Arrays.asList("1","3","3","5","5","20","21");

        System.out.println("Imprimir todos os elemento dessa List");
//        numerosAle.stream()
//                .forEach(System.out::println);
      /*  numerosAle.stream().forEach(new Consumer<String>() {//Interface Funcional
            @Override
            public void accept(String s) {
                System.out.println(s);
       */
//        numerosAle.forEach(s-> System.out.println(s));//Lambda

        numerosAle.forEach(System.out::println);//Reference Method

        System.out.println("Pegue os 3 primeiros números e coloque dentro de um Set:");
        numerosAle.stream()
                .limit(3)
                .collect(Collectors.toSet())//Coleta os 3 primeiros valores que foram delimitados no limit e seta na List
                .forEach(System.out::println);//Somente coleta

        System.out.println("Transforme esta lista de String em uma lista de números inteiros");

        List<Integer> collect = numerosAle.stream().map(Integer::parseInt).collect(Collectors.toList());//Transforma as Strings para Integer

        System.out.println("Pego os números pares e maiores que 2");
        List<Integer> pares = numerosAle.stream()
                .map(Integer::parseInt)
                .filter(o-> o%2==0 && o>2).collect(Collectors.toList());
        System.out.println(pares);
        System.out.println("");

        System.out.println("Mostre a média dos números");

        /*List<> media = */numerosAle.stream()//Reference metodhe
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remover os números impares");
//        collect.removeIf(i->i%2 !=0);

        System.out.println(collect);

        System.out.println("Ignore os 3 primeiros números da lista e imprima o restante");
        numerosAle.stream()
                .skip(3)
                .forEach(System.out::println);

        long contNun = numerosAle.stream()
                .distinct()//Numeros distintos
                .count();//Contagem
        System.out.println("Quantidade de números distintos: " + contNun);

        System.out.println("Mostrar o menor valor da lista");
        numerosAle.stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);

        System.out.println("Maior valor da lista");
        numerosAle.stream().
                mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

//        int somaDosNumerosPares = collect.stream()
//                .filter(i -> (i % 2 == 0))
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println("Ordem numérica: ");
        List<Integer> num =  collect.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(num);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = collect.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));

        System.out.println(collectNumerosMultiplosDe3E5);

    }

}
