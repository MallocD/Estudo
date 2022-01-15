package polimorfismo.subclasses;

import org.w3c.dom.ls.LSOutput;
import polimorfismo.Mamifero;

public class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Locomover");
    }
}
