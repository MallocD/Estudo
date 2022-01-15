package projetoFInal;

public class Gafanhoto extends Pessoa {
    private String login;
    private double totAssistido;

    public Gafanhoto(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }


    public void viuMaisum(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(double totAssistido) {
        this.totAssistido = totAssistido;
    }
}
