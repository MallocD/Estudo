package filas;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();//Utilizando o generics do tipo String

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");
        minhaFila.enqueue("sexto");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
        minhaFila.enqueue("Ultimo");
        System.out.println(minhaFila);
    }
}
