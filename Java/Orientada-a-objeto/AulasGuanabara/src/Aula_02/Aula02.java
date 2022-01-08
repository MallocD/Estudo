package Aula_02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();//Criando uma objeto a partir de um instanciamento;
        c1.modelo = "Bic Cristal";//Public
        c1.cor = "Azul";//public
//        c1.ponta = 0.8f;//private
        c1.carga = 90;//protected
        c1.tampar();


        c1.status();//Estados diferentes


    }
}
