package polimorfismo;

import polimorfismo.subclasses.Canguru;
import polimorfismo.subclasses.Cao;
import polimorfismo.subclasses.Cobra;

public class Main {
    public static void main(String[] args) {
       /* Mamifero m = new Mamifero(50.5, 3, 4, "Preto");
        Répitil r = new Répitil(0.2, 1, 4, "Verde");
        Peixe p = new Peixe(0.1, 1, 4,"Dourada");
        Aves a = new Aves(1.2, 1, 4,"Preto");*/

        /*System.out.println(r);
        System.out.println(m);
        System.out.println(p);
        System.out.println(a);
        a.emitirSom();*/

        Canguru c = new Canguru(80,2,4,"Branca");
        Cao ca = new Cao(20,1,4,"Marrom");
        Cobra co = new Cobra(3,1,0,"Verde");

        System.out.println(c);
        System.out.println("");
        System.out.println(ca);
        System.out.println("");
        System.out.println(co);
        co.locomover();
    }
}