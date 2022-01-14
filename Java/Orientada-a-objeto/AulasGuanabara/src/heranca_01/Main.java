package heranca_01;

public class Main {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[1];
        Professor[] prof = new Professor[1];
        Funcionario[] funcionario = new Funcionario[1];

        aluno[0] = new Aluno("Joao",19,"Masc","POO","Java");

        prof[0] = new Professor("Gustavo G.",23,"Masc","Enginer Software",2038);

        funcionario[0] = new Funcionario("Gerso",23,"Masc","Eletricista");

        System.out.println(aluno[0]);
        System.out.println("");
        aluno[0].cancelarMateria();

        prof[0].fazerAniversario();
        prof[0].receberAument(1000);
        System.out.println(prof[0]);
        System.out.println("");

        funcionario[0].mudarTrabalho();
        System.out.println(funcionario[0]);
    }
}
