package Aula_03;

public class Caneta {
    public String modelo ;
    private float ponta ;
    private boolean tampa;
    private String cor;

    public Caneta(String m, float p, String c){//O construtor utiliza o nome do método igual ao da classe
        setModelo(m);//O Construtor Caneta, passou dois parametros e colocou esses dois parametros dentro dos setters, no momento do instanciamento do objeto esses parametros devem ser passados para que haja o retorno e construção dos atributos;
        this.ponta = p;//As duas maneiras estão corretas tanto o setter quanto o this.
        this.tampar();
        this.cor = c;

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta(){
        return ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampa = true;
    }
    public void desTampar(){
        this.tampa = false;
    }

    public void status(){
        System.out.println("Modelo: " +this.getModelo());
        System.out.println("Ponta: " +this.getPonta());
        System.out.println("Cor: " +this.cor);
        System.out.println("Esta tampada?  " +this.tampa);

    }

}
