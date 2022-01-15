package polimorfismo;

public class Répitil extends Animal {
    private String corEscama;

    public Répitil(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Come sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de répteis");

    }

    @Override
    public String toString() {
        return "=======RÉPTIL======\n" +
                "\n Peso= " + getPeso() + "Kg"+
                "\n Idade= " + getIdade() +
                "\n Membros= " + getMembros() +
                 "\n Cor da Escama= "  +getCorEscama()+ "\n";

    }
}
