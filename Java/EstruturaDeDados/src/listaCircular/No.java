package listaCircular;

public class No<T> {

    private T conteudo;
    public No<T> proxiNo;

    public No(T conteudo){
        this.proxiNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProxiNo() {
        return proxiNo;
    }

    public void setProxiNo(No<T> proxiNo) {
        this.proxiNo = proxiNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
