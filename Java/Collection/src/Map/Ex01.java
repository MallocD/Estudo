package Map;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, Double> estados = new HashMap<>();{{
        estados.put("PE",9616621d);
        estados.put("AL",3351543d);
        estados.put("CE",9187103d);
        estados.put("RN",3534265d);}}

        System.out.println("Adicionando estados e population\n" + estados);

        //Subistitua a população do estado de RN por 3534165
        estados.put("RN",3534165d);
        System.out.println("Substituiando valor de uma chave\n" +estados);

        //Adicionar uma estado
        estados.put("PB",4039277d);
        System.out.println("Adicionando estado\n" + estados);

        Map<String,Double> estados2 = new LinkedHashMap<>(){{
            put("PE",9616621d);
            put("AL",3351543d);
            put("CE",9187103d);
            put("RN",3534265d);
        }};

        System.out.println("Exibindo na ordem que foi inserido\n" + estados2);

        Map<String,Double> estados1 = new TreeMap<>(estados);

        System.out.println("Ordem alfabética\n " + estados1);

        Collection<Double> populacao = estados.values();
        String estadoMaior = "";
        String estadoMenor = "";

        for(Map.Entry<String, Double> entry : estados.entrySet()){
            if(entry.getValue().equals(Collections.max(populacao)))
                estadoMaior = entry.getKey();
            else if(entry.getValue().equals(Collections.min(populacao)))
                estadoMenor = entry.getKey();
        }
        System.out.println("Exiba o estado com menor população "+ estadoMenor+ " com " + Collections.min(estados.values()));
        System.out.println("Exiba o estado com maior população "+ estadoMaior + " com " + Collections.max(estados.values()));

        double soma = 0;
        Iterator<Double> som = estados.values().iterator();
        while (som.hasNext()) {
            soma += som.next();
        }

        System.out.println("Soma de todos os habitantes : "+ soma);

        double media = soma/estados.size();

        System.out.println("Média de habitantes de todos os estados: "+ media);

        Iterator<Double> aba = estados.values().iterator();
        while (aba.hasNext()) {
            if(aba.next()<media) aba.remove();
        }
        System.out.println("Remoção de estados que estão a baixo da média: " + estados);

        estados.clear();

        System.out.println("Map estados"  + estados);




    }
}

