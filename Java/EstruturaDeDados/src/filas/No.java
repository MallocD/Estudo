package filas;

public class No {

    private Object object;//Váriavel do tipo object
    private No noRef;

    public No(){

    }
    public No(Object object) {
        this.noRef = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getNoRef() {
        return noRef;
    }

    public void setNoRef(No noRef) {
        this.noRef = noRef;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object+
                '}';
    }
}
