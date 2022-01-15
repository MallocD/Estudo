package projetoFInal;

public class Main {
    public static void main(String[] args) {
    Video v = new Video("POO");
//        System.out.println(v);

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Mic", "Masculino", 19);

        Visualizacao s = new Visualizacao(g[0],v);
        System.out.println(s);
    }



}
