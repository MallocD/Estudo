package heranca_02;

public class Main {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[1];
        Professor[] prof = new Professor[1];
        Funcionario[] funcionario = new Funcionario[1];
        Bolsista bols = new Bolsista("Roberto",20,"Mas","Engenharia de Software");
        Tecnico tec= new Tecnico("Roberto",20,"Mas","Engenharia de Software","Policial");

        Visitante visi = new Visitante("Jovi",19,"Masc");

        /*System.out.println(bols);
        System.out.println("==============");
        bols.pagarMensalidade();
        System.out.println(bols);*/

        System.out.println(tec);
        System.out.println("==============");
        tec.praticar();

    }
}
