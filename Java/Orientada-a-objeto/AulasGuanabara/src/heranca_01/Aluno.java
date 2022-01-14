package heranca_01;

public class Aluno extends Pessoa {
    private String materia;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String materia, String curso) {
        super(nome,idade,sexo);
        this.materia = materia;
        this.curso = curso;
    }

    public void cancelarMateria(){
        System.out.println("Matricula será cancelada");

    }

    public String getMateria() {
        return materia;
    }

    private void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCurso() {
        return curso;
    }

    private void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "=======Aluno======"+ "\n"+
                "\n Aluno: " + getNome() +
                "\n Idade: " + getIdade() +
                "\n Sexo: " + getSexo() +
                "\n Materia: " + materia  +
                "\n Curso: "  + curso;
    }
}
