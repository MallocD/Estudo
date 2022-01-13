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
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo())<0){
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(),novoNo));
        }
        return atual;
    }

    public void inOrdem(){
        System.out.println("\n Exibindo em ordem:");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo()+ ",");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void preOrdem(){
        System.out.println("\n Exibindo em ordem:");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo()+ ",");
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
        }
    }

    public void pOSOrdem(){
        System.out.println("\n Exibindo em ordem:");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo()+ ",");
        }
    }


}
