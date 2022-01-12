package ListaDuplamenteEncadeada;

public class ListaDuplaEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public  ListaDuplaEncadeada(){

    this.primeiroNo = null;
    this.ultimoNo = null;
    this.tamanhoLista = 0;
    }

    public void add(int index, T element){
        NoDuplo<T> noAuxiliar =getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoProximo(noAuxiliar);//Setar o proximo valor do no o noAuxi

        if(novoNo.getNoProximo() != null){//Se o proximo valor do no for diferente de nulo
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());//Seta o no previo com o valor previo do noAuxi
            novoNo.getNoProximo().setNoPrevio(novoNo);//Pega o valor do proximo no  e seta como valor previo o novo no
        }else{
            novoNo.setNoPrevio(ultimoNo);//Seta o valor previo como ultimo
            ultimoNo = novoNo;
        }
        if(index==0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);//Pega o valor previo do novo no e seta o proximo como noovo no
        }
        tamanhoLista++;

    }

    public void add(T element){
        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if(primeiroNo==null){
            primeiroNo =novoNo;
        }
        if(ultimoNo!=null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void remove(int index){
        if(index==0){
            primeiroNo= primeiroNo.getNoProximo();//Recebe o próximo nó sendo como novo nó
            if(primeiroNo!=null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxi = getNo(index);
            noAuxi.getNoPrevio().setNoProximo(noAuxi.getNoProximo());//Setar o proximo valor de noAuxi, como noPrev do noprev do no auxi --> 5 4 3 = 5 3
            if(noAuxi!=ultimoNo){
                noAuxi.getNoProximo().setNoPrevio(noAuxi.getNoPrevio());//Setar a previa do proximo valor como a previa do auxi--> 5 4 3 = 5 3

            }else{
                ultimoNo = noAuxi;
            }
        }
        this.tamanhoLista--;
    }

    public int size(){
        return tamanhoLista;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxi = primeiroNo;

        for(int i= 0;(i<index)&&(noAuxi!=null);i++){//Só ira parar caso o i seja maior que o index passado e o primeiro no seja igual a nulo, pois se for igual a nulo quer dizer que o indece passado é maior que a quantidade de nós;,
            noAuxi = noAuxi.getNoProximo();
        }return noAuxi;


    }

    @Override
    public String toString() {
        String strRetorn = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i<size(); i++){
            strRetorn += "{No[dado=" + noAuxiliar.getConteudo() + "}]==>";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorn += "Null";
        return strRetorn;
    }
}
