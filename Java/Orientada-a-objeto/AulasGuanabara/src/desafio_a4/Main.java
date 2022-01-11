package desafio_a4;

public class Main {
    public static void main(String[] args) {
        ContaBanco p4 = new ContaBanco();
        p4.abrirConta("CC");
        p4.setDono("Mic");
        p4.setNumConta(6731);
        p4.sacar(100);
        p4.fecharConta();
        p4.estadoAtual();

        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CI");
        p1.estadoAtual();



    }
}
