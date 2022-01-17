package Map;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {

        int quantLan = 100;

        List<Integer> valores = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < quantLan; i++) {
            int num = rand.nextInt(6) + 1;
            valores.add(num);
        }
        Map<Integer, Integer> vx = new HashMap<>();

        for (Integer resul : valores) {
            if (vx.containsKey(resul))
                vx.put(resul, (vx.get(resul) + 1));
            else vx.put(resul, 1);
        }

        System.out.println(vx);


        System.out.print("Jogando");
        //conteúdo do for + try/cath - totalmente opcional
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");

        for (Map.Entry<Integer, Integer> entry : vx.entrySet()) {
            System.out.println("Chave: "+  entry.getKey() + " Valor: " +  entry.getValue());
        }
    }
}


