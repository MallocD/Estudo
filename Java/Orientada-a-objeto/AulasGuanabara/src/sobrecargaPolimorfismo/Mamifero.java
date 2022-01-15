package sobrecargaPolimorfismo;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Andando");

    }

    @Override
    public void alimentar() {
        System.out.println("Dando alimento");

    }

    @Override//Sobrepõe o método de animal/ Polimorfismo
    public void emitirSom() {
        System.out.println("Som de mamíferos");

    }

    @Override
    public String toString() {
        return "=======MAMIFERO======\n" +
                "\n Peso= " + getPeso() +"Kg"+
                "\n Idade= " + getIdade() +
                "\n Membros= " + getMembros()+
                "\n Cor do Pelo= " + corPelo;
    }
}
