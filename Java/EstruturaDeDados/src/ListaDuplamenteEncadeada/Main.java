package ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplaEncadeada<String> lista = new ListaDuplaEncadeada<>();

        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        lista.add("c5");
        lista.add("c6");
        lista.add("c7");
        lista.add(2,"99");
        System.out.println(lista);
        System.out.println("Indíces: " + lista.size());
        lista.add("32");
        System.out.println("Indíces: " + lista.size());
        lista.remove(3);
        System.out.println("Indíces: " + lista.size());
    }
}
