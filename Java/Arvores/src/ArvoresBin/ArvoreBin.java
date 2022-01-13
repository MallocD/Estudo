package ArvoresBin;

public class ArvoreBin<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBin(){
     raiz=null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz,novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual,BinNo<T>novoNo){
        if(atual==null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo())<0){//Irá comparar o  conteúdo do novo nó com o do conteudo atual, assim decidindo se irá para esquerda ou direita
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));//Caso for menor ira setar na esquerda e irá verificar o conteudo atual existente no nó da esquerda, recursivamente o inserir
        }else{
            atual.setNoDir(inserir(atual.getNoDir(),novoNo));//Caso for maior ira setar na direita e irá verificar o conteudo atual existente no nó da direita, recursivamente o inserir
        }
        return atual;
    }

    public void remove(T conteudo){

        try{
            BinNo<T> atual = raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while(atual!=null && !atual.getConteudo().equals(conteudo)){//Enquando atual for diferente de nulo e o conteudo atual for diferente do conteudo passado;
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) <0 ){//Se o contéudo passado comparado ao conteudo atual for menor que 0 será no No esquerdo e se for maior sera no nó direito da raiz;
                    atual = atual.getNoEsq();//pai vai receber o no esquerdo atual
                }else {
                    atual=atual .getNoDir();//pai vai receber o no direito atual
                }
            }
            if(atual==null){
                System.out.println("Conteúdo não encontrado dentro do bloco Try;");
            }
            if(pai==null){
                if(atual.getNoDir()==null) {
                    raiz = atual.getNoEsq();
                }else if(atual.getNoEsq()==null){
                    raiz= atual.getNoDir();
                }else{
                    for(temp= atual,filho=atual.getNoEsq();
                    filho.getNoDir() != null;
                    temp= filho, filho = filho.getNoEsq()){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            }else if(atual.getNoDir()==null){
                if(pai.getNoEsq()==atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else{
                    pai.setNoDir((atual.getNoEsq()));
                }
            }else if(atual.getNoEsq()==null){
                if(pai.getNoEsq()==atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for(
                        temp = atual, filho= atual.getNoEsq();
                        filho.getNoDir()!=null;
                        temp =  filho, filho = filho.getNoDir()
                        ){
                    if(filho!=atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq()==atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }

                }
            }

    }catch (NullPointerException erro){
            System.out.println("Conteúdo não encontrado .Bloco catch");
        }
    }

    public void inOrdem(){
        System.out.println("\n Exibindo em ordem:");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());//Mostrar primeiro os valores da esquerda depois do centro e depois da direira
            System.out.print(atual.getConteudo()+ ",");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void preOrdem(){
        System.out.println("\n Exibindo em Pre-ordem:");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo()+ ",");//Mostrar primeiro os valores do centro depois da esquerda e depois da direira
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
        }
    }

    public void pOSOrdem(){
        System.out.println("\n Exibindo em Pos-ordem:");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());//Mostrar primeiro os valores da esquerda, depois da direira e por ultimo o centro
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo()+ ",");
        }
    }


}
