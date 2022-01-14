package heranca_02;

public class Bolsista extends Aluno {

    private boolean bolsa;

    public Bolsista(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo, curso);
        bolsa = false;
    }

    private void renovarBolsa(){
        setBolsa(true);
        System.out.println("Bolsa Renovada com sucesso!");
    }

    @Override//Sobrepõe o método herdado de aluno
    public void pagarMensalidade() {
        super.pagarMensalidade();
        renovarBolsa();

    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    @Override//Sobrepondo o seu super
    public String toString() {
        return "=======Bolsista======"+ "\n"+
                "\n Aluno: " + getNome() +
                "\n Idade: " + getIdade() +
                "\n Sexo: " + getSexo() +
                "\n Curso: " + getCurso() +
                "\n Bolsa Renovada : " + bolsa;
    }
    }

