package heranca_02;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome,idade,sexo);
        matricula = false;
        this.curso = curso;
    }

    public void pagarMensalidade(){
        setMatricula(true);
        System.out.println("Mensalidade Paga!");

    }

    public Boolean getMatricula() {
        return matricula;
    }

    protected void setMatricula(Boolean matricula) {
        this.matricula =matricula;
    }

    public String getCurso() {
        return curso;
    }

    private void setCurso(String curso) {
        this.curso = curso;
    }

    @Override//Sobrepondo o seu super
    public String toString() {
        return "=======Aluno======"+ "\n"+
                "\n Aluno: " + getNome() +
                "\n Idade: " + getIdade() +
                "\n Sexo: " + getSexo() +
                "\n Matricula: " + matricula +
                "\n Curso: "  + curso;
    }
}
