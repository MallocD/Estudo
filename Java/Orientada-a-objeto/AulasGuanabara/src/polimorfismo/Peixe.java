package polimorfismo;

public class Peixe extends Animal {
    private String corEscama;

    public Peixe(double peso, int idade, int membros, String corEscama) {

        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("BloBlo");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "\n =======PEIXE======\n" +
                "\n Peso= " + getPeso() + "Kg"+
                "\n Idade= " + getIdade() +
                "\n Membros= " + getMembros()+
                "\n Cor Escamas= "+ getCorEscama();
    }
}
