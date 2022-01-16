package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex00 {
    public static void main(String[] args) {
        List<Double> notas2 = new LinkedList<>();


        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2.get(0));
        System.out.println(notas2.remove(0));
        System.out.println(notas2);
    }


}
