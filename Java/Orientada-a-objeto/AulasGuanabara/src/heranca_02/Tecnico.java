package heranca_02;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public Tecnico(String nome, int idade, String sexo, String curso, String RgProfi) {
        super(nome, idade, sexo, curso);
        setRegistroProfissional(RgProfi);

    }
    public void praticar() {
        System.out.println("Estudando");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override//Sobrepondo o seu super
    public String toString() {
        return "=======Tecnico======"+ "\n"+
                "\n Tecnico: " + getNome() +
                "\n Idade: " + getIdade() +
                "\n Sexo: " + getSexo() +
                "\n Registro Profissional: " + getRegistroProfissional() +
                "\n Curso: "  + getCurso();
    }
    }

