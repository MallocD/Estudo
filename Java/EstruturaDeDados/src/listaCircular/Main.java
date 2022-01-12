package listaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> Circular = new ListaCircular<>();

        Circular.add("Cauda");
        Circular.add("gomo1");
        Circular.add("gomo2");
        Circular.add("gomo3");
        Circular.add("Cabeça");
        System.out.println(Circular);
        Circular.remove(2);
        System.out.println(Circular);
    }
}
