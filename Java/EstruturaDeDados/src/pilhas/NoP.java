package pilhas;

public class NoP {

    private int dado;
    private NoP refNo = null;

    public NoP(){

    }

    public NoP(int dado){//Construtor
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoP getRefNo() {
        return refNo;
    }

    public void setRefNo(NoP reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "NoP{" +
                "dado=" + dado +
                '}';
    }
}
