package sobrecarga.pack;

import java.awt.desktop.QuitEvent;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Exemplo de sobrecarga a seguir onde se mantem o método e muda apenas a assinatura(parametros)
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite o valor do lado do Quadrado:");
            int l= scan.nextInt();
                Quadrilatero.area(l);

        System.out.println("Digite o valor do lado 1 do retangulo:");
            double l1= scan.nextDouble();
        System.out.println("Digite o valor do lado 2 do retangulo:");
            double l2= scan.nextDouble();
                Quadrilatero.area(l1,l2);

        System.out.println("Digite o valor da base maior do trapézio:");
        int bM= scan.nextInt();
        System.out.println("Digite o valor da base menor do trapézio:");
        int bm= scan.nextInt();
        System.out.println("Digite o valor da altura do trapézio:");
        int alT= scan.nextInt();
            Quadrilatero.area(bM,bm,alT);

        System.out.println("Digite o valor da primeira diagonal do losango:");
        int d1 = scan.nextInt();
        System.out.println("Digite o valor da segunda diagonal do losango:");
        int d2 =scan.nextInt();

        Quadrilatero.area(d1,d2);
    }
}
