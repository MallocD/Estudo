package polimorfismo;

public class Aves extends Animal {

    private String corPena;

    public Aves(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Minhocas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Bentivi");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "\n =======Aves======\n" +
                "\n Peso= " + getPeso() + "Kg"+
                "\n Idade= " + getIdade() +
                "\n Membros= " + getMembros()+
                "\n Cor Penas= "+ getCorPena();
    }
}
