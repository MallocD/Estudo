package heranca_01;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo,String especialidade, double salario) {
        super(nome, idade, sexo);
        setEspecialidade(especialidade);
        setSalario(salario);


    }

    public void receberAument(double aumento){
        setSalario(getSalario()+ aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    private void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "=======Professor======"+ "\n"+
                "\n Professor: " + getNome() +
                "\n Idade: " + getIdade() +
                "\n Sexo: " + getSexo() +
                "\n Especialidade: " + especialidade  +
                "\n Salário R$"  + salario;
    }
}
