package ArvoresBin;
import ArvoresBin.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBin<Obj> minhaArvore = new ArvoreBin<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(18));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(30));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        minhaArvore.preOrdem();
        minhaArvore.pOSOrdem();
        minhaArvore.inOrdem();

    }
}
