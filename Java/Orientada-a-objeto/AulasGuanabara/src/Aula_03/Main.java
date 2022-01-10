package Aula_03;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic",1.5f, "Preto");
        c1.status();

        c1.modelo = "Bic";//Como está publico consigo mexer diretamente no atributo
        c1.setModelo("Bic");//Ou por meio de um método para acessar o atributo para mim

       // c1.ponta = 1.3f; //Não consigo fazer acesso direto ao atributo do objeto pelo fato de ser um atributo privado
        c1.setPonta(1.2f);//Logo é preciso que eu faça a chamada do método para que ele possa acessar e setar o valor ao atributo para mim

        System.out.println("Tenho uma caneta : " + c1.getModelo());//Acessar o valor diretamente que foi recebido por getModel();
//        c1.status();
    }
}
