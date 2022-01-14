package encapsulamento;

public class ControleRemoto implements ControladorR {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public void ligar(){
        setLigado(true);
    }

    public void desligar(){
        setLigado(!isLigado());
    }

    public void abrirMenu(){
        if(isLigado()){
            System.out.println("Status Tv :" +isLigado());
            System.out.print("Volume: " +getVolume());
            for(int i = 0; i<getVolume(); i= i+10){
                System.out.print("|");
            }
            System.out.println("\n"+isTocando());
        }else System.out.println("TV Desligada");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    public void maisVolume(){
        if(isLigado())
            setVolume(getVolume()+5);
    }

    public void menosVolume(){
        if(isLigado())
            setVolume(getVolume()-5);
    }

    public void ligarMudo(){
        if(isLigado() && getVolume()>0)
            setVolume(0);
    }

    public void desligarMudo(){
        if(isLigado()&& getVolume()==0)
            setVolume(20);
    }

    public void play(){
        if(isLigado()){
            setTocando(true);
        }
    }

    public void pause(){
        if(isLigado() && isTocando()){
            setTocando(false);
        }
    }


    public int getVolume(){
        return volume;
    }

    private void setVolume(int Volume){
        volume =Volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
