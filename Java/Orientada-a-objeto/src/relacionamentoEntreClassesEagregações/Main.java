package relacionamentoEntreClassesEagregações;

//Agragação entre objetos

public class Main {
    public static void main(String[] args) {

        Lutador[] luta = new Lutador[5];
        luta[0] = new Lutador("Marcos","Brasil",19,1.78f,78,2,3,1);
        luta[1] = new Lutador("Luffy","Japão",29,1.78f,110.3f,1,2,3);
        luta[2] = new Lutador("Sergio","Tailandia",32,1.78f,55,3,1,6);
        luta[3] = new Lutador("Naiti","Anglo-França",30,1.78f,89,1,4,5);
        luta[4] = new Lutador("Roberto","Mexico",20,1.78f,98,2,0,11);

        Luta lutar = new Luta();


        lutar.marcarLuta(luta[3],luta[4]);
        lutar.lutar();

        luta[3].status();
        luta[4].status();






    }
}
