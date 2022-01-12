package listaCircular;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        cauda =null;
        cabeca = null;
        tamanhoLista=0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(tamanhoLista==0){
            cabeca = novoNo;
            cauda = cabeca;
            this.cabeca.setProxiNo(cabeca);
        }else{
            novoNo.setProxiNo(cauda);
            cabeca.setProxiNo(novoNo);
            cauda=novoNo;
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index>=tamanhoLista)
            throw new IndexOutOfBoundsException("Indice é maior que o tamanho da lista");
        No<T> noAuxi=this.cauda;
        if(index==0) {
            cauda = this.cauda.getProxiNo();//a cauda vai receber o valor do seu proximo nó
            cabeca.setProxiNo(cauda);//A cabeça vai setar o valor da nova cauda como proximono
        }else if(index==1){
            cauda.setProxiNo(cauda.getProxiNo().getProxiNo());//Seta o proximo do proximo como valor atual da cauda
        }else {
            for(int i = 0; i<index-1;i++){
                noAuxi = noAuxi.getProxiNo();
            }
            noAuxi.setProxiNo(noAuxi.getProxiNo().getProxiNo());
        }
        tamanhoLista--;
    }

    public T get(int index){
    return this.getNo(index).getConteudo();
}

    private No<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if(index==0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;//Entra pela cauda e vai circulando buscando o valor do indice desejado
        for(int i= 0; i<index;i++){
            noAuxiliar = noAuxiliar.getProxiNo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public int size(){
    return this.tamanhoLista;
}

    @Override
    public String toString() {
        String strReturn="";

        No<T> noAuxi = cauda;
        for(int i=0; i<size();i++){
            strReturn+= "{No[dados=" + noAuxi.getConteudo() + "]}";
            noAuxi = noAuxi.getProxiNo();
        }
            strReturn+= isEmpty()?("isEmpty") : ("Retorna ao ínicio");

        return strReturn;
    }
}
