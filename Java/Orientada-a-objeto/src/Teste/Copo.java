package Teste;

import java.util.Scanner;

public class Copo {
    String marca;
    String cor;
    boolean tampado;
    float volume;
    int capacidade;
    int d;

    void situacaoCopo(){
        System.out.println("A cor do copo é: " +this.cor);
        System.out.println("A marca do copo é: "+this.marca);
        System.out.println("A capacidade do copo é de: "+this.capacidade+"ml");
        System.out.println("Seu copo está com: "+this.volume+ "ml de bebida");
    }

    void encherCopo() {
        Scanner scan = new Scanner(System.in);

        if (this.volume < this.capacidade) {
            System.out.println("Seu copo ainda cabe bebida,caso queira enchelo digite 1\nCaso contrário digite 2...");
            if (this.d == 1 && !tampado) {
                this.volume =this.capacidade;
            }
        }
    }

    void colocarBebida() {
        Scanner scan = new Scanner(System.in);
        boolean bebe= this.volume <this.capacidade;

        if (bebe && this.tampado && this.d==1) {
            System.out.println("Seu copo está tampado não há como colocar bebida");
            System.out.println("Deseja abrir o copo?\nSe sim digite 1, se não digite 2...");
            int ix = scan.nextInt();
            if (ix == 1) {
                this.abrirCopo();
            }
        }
    }

    void tamparCopo(){
        this.tampado = true;
    }

    void abrirCopo(){
        this.tampado = false;
        System.out.println("Abrindo seu copo e o enchendo de bebida");
        this.volume += (this.capacidade - this.volume);
     }
    }




