package heranca_01;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade,sexo);
        trabalhando = false;
        this.setor = setor;
    }
    public void mudarTrabalho(){
        setTrabalhando(true);

    }

    public String getSetor() {
        return setor;
    }

    private void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    private void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "=======Funcionário======"+ "\n"+
                "\n Funcionário: " + getNome() +
                "\n Idade: " + getIdade() +
                "\n Sexo: " + getSexo() +
                "\n Setor: " + setor  +
                "\n Trabalhando: "  + trabalhando;
    }
}
