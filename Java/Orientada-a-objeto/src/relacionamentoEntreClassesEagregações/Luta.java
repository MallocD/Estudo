package relacionamentoEntreClassesEagregações;

import java.util.Objects;
import java.util.Random;

//Agragação entre objetos

public class Luta {
    private Lutador desafiado;//Uma instancia de uma classe, de lutador tipo de dado abstrato
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (Objects.equals(l1.getCategoria(), l2.getCategoria())) {
            if (!Objects.equals(l1.getNome(), l2.getNome())) {
                aprovada = true;
                desafiado = l1;
                desafiante = l2;
            }
        }else{
            System.out.println("Luta não aprovada : Categorias diferentes");
            aprovada = false;
            desafiado = null;
            desafiante = null;
    }
}

    public void lutar(){
        Lutador l1= desafiado;
        Lutador l2= desafiante;

        if(aprovada){
            l1.apresentar();
            System.out.println("--------------Contra--------------");
            l2.apresentar();
            System.out.println("========RESULTADO=======");

//          Random rand = new Random(3);//Outra maneira de chamar a classe dela, instanciando um objeto a partir dela;
            int rand = 1 + (int)(Math.random() * 3);

            switch (rand){
                case 1 -> {
                    System.out.println("Empate");
                    l1.empatarLuta();
                    l2.empatarLuta();
                }
                case 2 -> {
                    System.out.println(l1.getNome() + " É o ganhador");
                    l1.ganharLuta();
                    l2.perderLuta();
                }
                case 3 -> {
                    System.out.println(l2.getNome()+" É o ganhador");
                    l2.ganharLuta();
                    l1.perderLuta();
                }default -> System.out.println("Error");
            }
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;

    }

}
