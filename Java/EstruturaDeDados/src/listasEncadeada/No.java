package listasEncadeada;

public class No<T> {

    private T conteudo;
    private No proxNo;

    public No(){
        this.proxNo= null;
    }

    public No(T conteudo){
        this.proxNo = proxNo;
        this.conteudo = conteudo;
    }
    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }
    public T getConteudo(){
        return conteudo;
    }

    public void setProxNo(No proxNo){
        this.proxNo = proxNo;
    }
    public No getProxNo(){
        return proxNo;
    }

    @Override
    public String toString(){
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado(){
        String str  = "No{" +
                "conteudo="+ conteudo +
                '}';

        if(proxNo!=null){
            str+= "->" + proxNo.toString();
        }else{
            str+= "=> null";
        }
        return str;
    }
}
