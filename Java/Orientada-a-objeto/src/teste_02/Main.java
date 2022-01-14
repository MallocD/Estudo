package teste_02;

public class Main {
    public static void main(String[] args) {
        Pessoa[] leitor = new Pessoa[3];
        Livro[] livro = new Livro[2];

        leitor[0] = new Pessoa("João",19,"Masc");

        livro[0] = new Livro("Século XX","Lidin",340,82,leitor[0]);
        livro[1]= new Livro("Século aX","Lidin",340,82,leitor[0]);
        System.out.println(livro[0].detalhes());
        System.out.println(livro[1].detalhes());

        livro[0].folhear(20);
        System.out.println(livro[0].detalhes());

    }
}
