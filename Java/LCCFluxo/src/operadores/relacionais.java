package operadores;

public class relacionais {
    public static void main(String[] args) {
        int i1 = 2;
        int i2= 3;
        String s1 = "elo";
        String s2= "elo";
        String s3= "alo";
        char c1= 'X';
        char c2 = 'c';
        char c3 = 'b';
        boolean b1= true;
        boolean b2 = false;
        float f2 = 22.3f;

        System.out.println("c1==c2"+ (c1==c2));
        System.out.println("c3<c2"+ (c3<c2));
        System.out.println("c1<c2"+ (c1<c2));
        System.out.println("c1>c2"+ (c1>c2));
        System.out.println("f e i"+ (i2>f2));
        System.out.println("ola" + (b1==b2));
        System.out.println("b1=b2" + (b1=b2));//Recebe o valor do booolean b2
        System.out.println("b1==b2" + (b1==b2));
        System.out.println("S1 e s2"+(s1==s2));
        System.out.println("S1 e s3"+(s1==s3));


    }
}
