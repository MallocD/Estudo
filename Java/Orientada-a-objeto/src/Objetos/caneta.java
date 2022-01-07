package Objetos;

public class caneta {

    //Atributos
    String modelo = "Bic";
    String cor = "Preta";
    float ponta = 0.7f;
    int carga = 100;
    static boolean tampada = false ;

    //Estado
    public static void main(String[] args) {
        caneta.escrever();
    }

    //Método
    private static void escrever(){
        if(tampada){
            System.out.println("Destampe a caneta");
        }else{
            System.out.println("O que deseja escrever?");
        }

    }
}
