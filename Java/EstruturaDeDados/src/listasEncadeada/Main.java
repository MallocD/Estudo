package listasEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.add("teste1");
        lista.add("teste4");
        lista.add("teste2");
        lista.add("teste3");

        System.out.println(lista.get(0));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println(lista);

        lista.remove(3);

        System.out.println(lista);


    }
}
