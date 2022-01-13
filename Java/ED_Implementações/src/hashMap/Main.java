package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();//Implemento da classe Map e HashMap com dois tipos String instanciando o objeto aluno

        aluno.put("Nome", "Joao");//Adicionar chaves(index) e valores
        aluno.put("Idade", "19");
        aluno.put("Facul", "ES");
        aluno.put("Ca", "bau");

        System.out.println(aluno);

        System.out.println(aluno.keySet());//key.set Mostra os nomes das chaves que foram setadas
        System.out.println(aluno.values());//.values Mostra os valores de cada chave

        List<Map<String, String>> listaAlun = new ArrayList<>();//Implementa a classe List e ArrayList passando o tipo  Map<String, String> instanciando o objeto listAlun

        listaAlun.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Jose");
        aluno2.put("IDADE", "20");
        aluno2.put("FC", "EG");
        aluno2.put("Prof", "Açougue");

        listaAlun.add(aluno2);
        System.out.println("--------------");
        System.out.println(listaAlun);
        System.out.println(aluno.containsKey("Nome"));//Verifica se existe uma chave com esse valor passado



    }
}
