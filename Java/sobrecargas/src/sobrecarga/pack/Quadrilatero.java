package sobrecarga.pack;

public class Quadrilatero {
//Exemplo de sobrecarga a seguir onde se mantem o método e muda apenas a assinatura(parametros)//Não pode haver dois tipos com o mesmo número de parametros iguais
    public static void area(double lado){

        System.out.println("Área do quadrado: " + lado*lado);

    }public static void area(double lado1, double lado2){

        System.out.println("Área do retângulo: " + lado1*lado2);

    }public static void area(double baseMaior, double baseMenor, double altura){

        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }
    public static void area(float diagonal1, float diagonal2){

        System.out.println("Área do losangulo: " + ((diagonal1+diagonal2)/2));
    }

}
