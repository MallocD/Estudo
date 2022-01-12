package filas;

public class Fila {

    private No refNoEntrada;

    public Fila(){
        this.refNoEntrada = null;
    }

    public void enqueue(No novoNo){
        novoNo.setNoRef(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public No first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntrada;
            while (true){
                if(primeiroNo.getNoRef()!=null){
                    primeiroNo = primeiroNo.getNoRef();
                }else {
                    break;}

            } return primeiroNo;
        }return null;

    }

    public No dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;
            while (true){
                if(primeiroNo.getNoRef()!=null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getNoRef();
                }else{
                    noAuxiliar.setNoRef(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;

    }



    public boolean isEmpty(){
        return refNoEntrada ==null? true : false;
    }
    @Override
    public String toString(){
        String stringRetorno= "";
        No noAuxiliar = refNoEntrada;
        if (refNoEntrada!=null){
            while(true){
                stringRetorno += "[No{objeto= " + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getNoRef()!=null){
                noAuxiliar = noAuxiliar.getNoRef();
                }else {
                    stringRetorno += "Null" ;
                    break;}
            }
        }else{
            stringRetorno = "null";}
        return stringRetorno;
    }
}
