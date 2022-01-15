package projetoFInal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video file;

    public Visualizacao(Gafanhoto espectador, Video file) {
        this.espectador = espectador;
        this.file = file;
        espectador.setTotAssistido(espectador.getTotAssistido()+1);
        this.file.setViews(file.getViews()+1);

    }
    public void avaliar(){
        this.file.setAvaliacao(5);

    }

    public void avaliar(int nota){
        this.file.setAvaliacao(nota);

    }

    public void avaliar(double porc){
        int tot = 0;
        if(porc<=20){
            tot = 30;
        }else if(porc<=50){
            tot = 5;
        }else if(porc<=90){
            tot = 8;
        }else{
            tot = 10;
        }
        file.setAvaliacao(tot+ file.getAvaliacao());

    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFile() {
        return file;
    }

    public void setFile(Video file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return
                "\n Gafanhoto= \n" + espectador + "\n"+
                "\n Esta assitindo = \n" + "\n"+ file +
                '\n';
    }
}
