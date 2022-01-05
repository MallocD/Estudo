package one;

public class casting {
    public static void main(String[] args) {
        byte b1;
        short s1 = 1000;
        b1= (byte) s1;//Downcast

        long l1;
        int i1= 10;
        l1= i1;//Upercast

        int i2;
        long l2 = 10000000000000000l;
        i2 = (int) l2;//Downcastint i2;

        int i3;
        long l3 = 10000l;
        i3 = (int) l3;//Downcast

        double d1;
        float f1 = 10.5f;
        d1 = f1;//Upercast

        float f2;
        float f3;
        double d2= 10000.58;
        f2= (float) d2;//Downcast
        double d3= 1000.59999999999999999999999999999999999999999999999999999999;
        f3= (float) d3;//Downcast

        int i4;
        float f4= 11.5902f;
        i4 = (int) f4;//Downcast

        System.out.println("b1: "+ b1);
        System.out.println("l1: "+ l1);
        System.out.println("i2: "+ i2);
        System.out.println("i3: "+ i3);
        System.out.println("i4: "+ i4);
        System.out.println("d1: "+ d1 );
        System.out.println("f2: "+ f2);
        System.out.println("f3: "+ f3);

        byte b5;
        b5=(byte)d2;

        System.out.println("b5: " + b5 );




    }
}
