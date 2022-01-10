package pilhas;

public class Pilha {

private NoP refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;// Quando a classe pilha for instanciada seu valor de referencia será null;
    }

    public void push(NoP novoNo){//Irá receber o novo nó
        NoP refAuxiliar = refNoEntradaPilha;//Uma referencia auxiliar para receber a referencia do nó que antes estava no topo
        refNoEntradaPilha = novoNo;//Irá receber a nova referencia do novo nó
        refNoEntradaPilha.setRefNo(refAuxiliar);//Irá setar o nó novo como referencia para o nó antigo

    }

    public NoP pop(){
        if(!isEmpty()){
            NoP noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();//Irá receber a referencia do nó depois dele
            return noPoped;
        }
        return null;
    }

    public NoP top(){
     return refNoEntradaPilha;//Retorna para a referencia;
    }

    public boolean isEmpty(){

        return refNoEntradaPilha == null? true : false; // Se o valor for nulo irá retornar true
    }

    @Override
    public String toString(){
        String stringRetorno = "--------------\n";
        stringRetorno+= "     Pilha\n";
        stringRetorno += "--------------\n";

        NoP noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar!=null){
                stringRetorno+= "[No{dado"+ noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else break;
        }
        stringRetorno += "===============\n";
     return stringRetorno;

    }

}
