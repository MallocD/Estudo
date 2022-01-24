package projetoFInal;

public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade, experiencia;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    protected void ganharExp(){
        setExperiencia(getExperiencia()+1);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return " Pessoa{\n" +
                " Nome= " + nome  +
                "\n Sexo= " + sexo +
                "\n Idade=" + idade +
                "\n Experiencia=" + experiencia;
    }
}