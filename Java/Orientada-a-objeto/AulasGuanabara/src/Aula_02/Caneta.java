package Aula_02;

public class Caneta {

    //Atributos
    public String modelo;//Visibilidade padrão : Publica para pacote
    String cor;//Visibilidade padrão : Publica para pacote
    private float ponta;
    protected int carga;
    private boolean tampada;//Só a classe atual terá acesso a este atributo;

    public void status(){
        System.out.println("Qual o modelo da caneta? "+ this.modelo );
        System.out.println("Qual a cor da caneta? " + this.cor);//Auto referenciamento
        System.out.println("Qual o tamanho da ponta? "+ this.ponta);
        System.out.println("A carga está em: "+ this.carga+ "%");
        System.out.println("Está tampada? " +this.tampada);
    }

    public void rabiscar(){
        if(this.tampada)
            System.out.println("Impossivel escrever com a caneta tampada");
            else
                System.out.println("Estou rabiscando");

    }

    public   void tampar(){
    this.tampada=true;
    }

   public void destampar(){
    this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
