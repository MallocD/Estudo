package one;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        //Pós Fixado:
        int b  =10;
        int i = b++;
        int c= b;
        System.out.println("Primeiro valor declarado:" + i);
        System.out.println("Valor pós fixado:" + c);
        //Pré-fixado
        int d= 20;
        System.out.println("Primeiro valor declarado:"+ d);
        int j= ++d;
        System.out.println("Valor pré fixado:" + j);
        //Atribuição:
        float a= 12;
        float x= 20;
        double[] n = new double[4];
        n[0]= a/x;//a/=x;=>a=a/x;--Váriavel a recebe a/x assim atribuindo um novo valor à a;
        n[1]=a*x;//a*=x;=>a=a*x;--Váriavel a recebe a*x assim atribuindo um novo valor à a;
        n[2]=a+x;//a+=x;=>a=a+x;--Váriavel a recebe a+x assim atribuindo um novo valor à a;
        n[3]=a-x;//a-=x==>a=a-x;--Váriavel a recebe a-x assim atribuindo um novo valor à a;
        System.out.println("Valor d a dividido e atribuido a x:"+ (n[0]) );
        System.out.println("Valor d a multiplicado e atribuido a x:"+ (n[1]) );
        System.out.println("Valor d a Somado e atribuido a x:"+ (n[2]) );
        System.out.println("Valor d a subtraido e atribuido a x:"+ (n[3]) );

   /* byte b1 =20;
    byte b2= 12;

    short s1= 2000;
    short s2= 3000;

    int i1= -100000000;

    long l1= 100000000000L;
    long l2= 100000000000l;//Sem o L não irá se cria uma variável

    float f2= 2.500f;
    double d2= 2000.03;

    char c1 = 'j';
//    char c2 = 'js';//Erro pois aceita somente um caractére;
//    char c3= "j";//Erro pois é um char e char deve ser entre ' ' e não " ";
    char c4= '\u0058';

    String st1 = "Joao";
    String st2 = "Vitor Santana";

    boolean bo1 =true;
    boolean bo2=false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(bo1);
        System.out.println(bo2);*/





        /*int i;//Boas Práticas
        int I;//Boas Práticas
//        int 1a;
        int _1a;//Não é uma boa pratica
        int $aq;//Não é uma boa pratica

        i=5;
        I=10;
        _1a=20;
        $aq=7;

        final int j = 22;//Váriavel constante
//        j=21;
        int asrn2456md=23;
//        int asrn234 68md;
        int asrn234$_MD= 10;
//        int asrn2$&_md=10;

        int quantidadeProduto =50;//Camel case
        //int QuantidaProduto;//Não segue as boas práticas do camel case
        final int NUMERO_TENTAIVAS=5;//Camel case
        int QUANTIDADE_OPCOES= 25;//Não segue as boas práticas do const
        int qtdProd; //Não segue as boas praticas de nomes expressivos

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn2456md);
        System.out.println(asrn234$_MD);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTAIVAS);
        System.out.println(QUANTIDADE_OPCOES);*/
    }
}
