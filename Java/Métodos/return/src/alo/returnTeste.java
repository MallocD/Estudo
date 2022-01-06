package alo;

public class returnTeste {


    public static int area(int l){//Quadrado

        return l*l;
    }
    public static float area(float l1, float l2){//Retangulo

        return l1*l2;
    }
    public static double area(double baseM, double basem, double altura){//Trapézio
        return (((baseM+basem)*altura)/2);
    }
    public static double area(double di1, double di2){//Losango
        return ((di1+di2)/2);
    }
}
