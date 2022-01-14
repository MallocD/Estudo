package heranca_02;

public abstract class Pessoa {//Quando estanciada abstract não pode ser instanciada como objeto
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        setIdade(idade);
        setSexo(sexo);
        setNome(nome);
    }
    public final void fazerAniversario(){//Quando declarado final não pode ser sobreposto
        setIdade(getIdade()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "=======Pessoa======"+ "\n"+
                "\n Nome: " + getNome() +
                "\n Idade: " + getIdade() +
                "\n Sexo: " + getSexo();
    }
    }
