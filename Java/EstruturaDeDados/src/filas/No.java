package filas;

public class No<T> {//Utilizando o generics de qualquer tipo

    private T object;//Váriavel do tipo object
    private No<T> noRef;

    public No(){

    }
    public No(T object) {
        this.noRef = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getNoRef() {
        return noRef;
    }

    public void setNoRef(No<T> noRef) {
        this.noRef = noRef;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object+
                '}';
    }
}
