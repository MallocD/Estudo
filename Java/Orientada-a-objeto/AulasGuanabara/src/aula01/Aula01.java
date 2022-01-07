package aula01;

public class Aula01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();//Criando uma objeto a partir de um instanciamento;

        c1.cor="Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic";
        c1.carga = 75;//Objeto fazendo chamada a atributo;

        c1.tampar();
        c1.status();//Obejto c1 fazendo chamada ao método status //Message;
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Zarui";
        c2.cor = "Vermelha";
        c2.ponta = 0.7F;
        c2.carga = 30;

        System.out.println("------------------------");

        c2.status();//Estados diferentes
        c2.rabiscar();


    }
}
