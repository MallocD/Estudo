package pilhas;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new NoP(1));
        minhaPilha.push(new NoP(2));
        minhaPilha.push(new NoP(3));
        minhaPilha.push(new NoP(4));
        minhaPilha.push(new NoP(5));
        minhaPilha.push(new NoP(6));

        System.out.println(minhaPilha);
        minhaPilha.pop();

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.top());
    }
}
