package filas;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("quarto"));
        minhaFila.enqueue(new No("quinto"));
        minhaFila.enqueue(new No("sexto"));

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
        minhaFila.enqueue(new No("Ultimo"));
        System.out.println(minhaFila);
    }
}
