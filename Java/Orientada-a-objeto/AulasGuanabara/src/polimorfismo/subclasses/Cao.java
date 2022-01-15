package polimorfismo.subclasses;

import polimorfismo.Mamifero;

public class Cao extends Mamifero {
    public Cao(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);


    }
        public void enterraOsso(){
            System.out.println("Enterrando osso");
        }
        public void abanarRabo(){
            System.out.println("AbanandoRabo");
        }
}
