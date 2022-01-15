package projetoFInal;

public class Video implements AcoesVideo {
    private String titulo;
    private int views, curtidas,avaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        reproduzindo = true;
    }

    @Override
    public void pause() {
        reproduzindo = false;
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas()+1);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova =(int) ((this.avaliacao+avaliacao)/views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "========VIDEO=========\n" +
                "\n Titulo do vídeo= " + titulo  +
                "\n Avaliação = " + avaliacao +
                "\n Views= " + views +
                "\n Curtidas= " + curtidas+
                "\n Reproduzindo agora: " + reproduzindo;
    }
}
