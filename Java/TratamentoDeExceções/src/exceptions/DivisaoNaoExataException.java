package exceptions;

public class DivisaoNaoExataException extends Exception {
    private int numerador;
    private int Denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        Denominador = denominador;
    }
}
