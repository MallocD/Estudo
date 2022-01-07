package aula01;

public class Caneta {

    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Qual o modelo da caneta? "+ this.modelo );
        System.out.println("Qual a cor da caneta? " + this.cor);//Auto referenciamento
        System.out.println("Qual o tamanho da ponta? "+ this.ponta);
        System.out.println("A carga está em: "+ this.carga+ "%");
        System.out.println("Está tampada? " +this.tampada);
    }

    void rabiscar(){
        if(this.tampada)
            System.out.println("Impossivel escrever com a caneta tampada");
            else
                System.out.println("Estou rabiscando");

    }

    void tampar(){
    this.tampada=true;
    }

    void destampar(){
    this.tampada = false;
    }


}
