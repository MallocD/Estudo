package listasEncadeada;

public class ListaEncadeada<T>{

    private No<T> refEntrada;

    public ListaEncadeada(){
        this.refEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);//Irá receber o valor do novo nó
       if(this.isEmpty()){//Caso a lista esteja vazia a refEntrada irá receber o valor do nó  e pronto
           refEntrada = novoNo;
           return;
        }
       No<T> noAux = refEntrada;//Se não ele irá passar de nó em nó até o final da lista
       for(int i =0;i<this.size()-1;i++){
           noAux = noAux.getProxNo();
        }
       noAux.setProxNo(novoNo);//Quando o for deixar de ser verdadeiro e parar de correr a lista irá setar o novo nó como ultimo

    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaInd(index);

        No<T>  noAuxilar = refEntrada;
        No<T> noRetorno = null;

        for(int i =0; i<=index;i++){
            noRetorno = noAuxilar;
            noAuxilar = noAuxilar.getProxNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index==0){
            refEntrada = noPivor.getProxNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index-1);
        noAnterior.setProxNo(noPivor.getProxNo());
        return noPivor.getConteudo();
    }

    public int size(){
        int tamanho = 0;
        No<T> refAuxiliar= refEntrada;
        while(true){
            if(refAuxiliar!=null){
                    tamanho++;
                if(refAuxiliar.getProxNo()!=null){
                    refAuxiliar = refAuxiliar.getProxNo();
                }else break;

            }else break;
        }
        return tamanho;
    }

    private void validaInd(int index){
        if(index >= size()){
            int ultimoInd = size()-1;
            throw new IndexOutOfBoundsException("Não existe contéudo no índece" + index +" desta linha. Essa lista só vai até o índece"+ ultimoInd+ ".");
        }
    }

    private boolean isEmpty(){
       return refEntrada==null?true:false;
    }

    @Override
    public String toString(){
        String strReturn = "";
        No<T> noAuxi = refEntrada;
        for(int i = 0;i<size();i++){
            strReturn+= "[No{conteudos=" +noAuxi.getConteudo() + "}]-->";
            noAuxi = noAuxi.getProxNo();
        }
        strReturn+= "Null";
        return strReturn;
    }
}
