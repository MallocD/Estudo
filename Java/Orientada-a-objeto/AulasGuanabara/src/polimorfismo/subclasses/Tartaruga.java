package polimorfismo.subclasses;

import polimorfismo.Répitil;

public class Tartaruga extends Répitil {

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Andando");
    }

    public Tartaruga(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);

    }
}
