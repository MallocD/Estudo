package one;

public class mets {
    public static void main(String[] args) {
        System.out.println("-----Prep-----");
        prePos();
        System.out.println("-----Aritmético-----");
        aritmetico();
        System.out.println("-----Atribuição-----");
        atribuicao();
        System.out.println("-----Precedência------");
        precedencia();
    }

    private static void prePos() {
        int k = 10;

        int i = ++k;//Incrementa pré, no mesmo momento;
        int j = k--;//Incrementa pós, após o valor ser utilizado uma vez;
        int x = k;//O valor que foi incrementando em j será convertido agora

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + k);

    }
    private static void aritmetico(){

        int[] n= new int[5];
        n[0]= 10;
        n[1]= 20;
        n[2]= 30;
        n[3]= 40;
        n[4]= 50;

        int[] r=new int[5];
        r[0]= n[0]+n[1];
        r[1]= n[2]-n[0];
        r[2]= n[3]*n[1];
        r[3]= n[4]/n[0];
        r[4]= n[2]%n[1];

        System.out.println("a+b ="+r[0]);
        System.out.println("c-a ="+r[1]);
        System.out.println("d*b ="+r[2]);
        System.out.println("e/a ="+r[3]);
        System.out.println("c%b ="+r[4]);

    }
    private static void atribuicao(){

        int i = 1500;//Atribuição simples
        short j= 15;//Atribuição simples
        long l=500L;//Atribuição simples
        int k= 35;//Atribuição simples
        float f=3.5f;//Atribuição simples
        double d= f;//Atribuição simples

        System.out.println("d : "+ d);

        i += 5;// i= i + 5;//Atribuição composta
        j -= 3;//j= j - 3;//Atribuição composta
        d /= 2.7d;//d= d / 2.7d;//Atribuição composta
        l *= 3;//l= l * 3;//Atribuição composta
        k %= 2;//k= k % 2;//Atribuição composta

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i= k= j;//Variável "k" irá receber o valor da váriavel "j" e a váriavel "i" irá receber o valor da váriavel "k"

        System.out.println("k: "+k);
        System.out.println("i: "+i);

    }

    private static void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;

        int a= i++ + -j * k;//10 + 19 * 30-> 10 + 570 = 580

        System.out.println("([i++] + ([--j] * k))--> " + a);

        System.out.println("i: " + i);//11

        int b = k / --i % 3 + 1 ;// 30 / 10 % 3 + 1 -> 1

        System.out.println("(([k / {--i}] % 3) + 1)--> " + b);

        System.out.println("i: " + i);//10

        int c =2;

        c *= i += 5;//c = c * i;i = 10 + 5; c= 2 * 15 -> c = 30;

        System.out.println("(c *= (i += 5))--> " + c);


    }
}




