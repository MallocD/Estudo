package sobrecargaPolimorfismo;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Cao extends Mamifero {
    public Cao(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);


    }
    public void reagir(String frase){
        if(Objects.equals(frase, "Toma cuidado") || Objects.equals(frase, "ola")){
            System.out.println("Abanar e latir");
            }else {
            System.out.println("Rosnar");
        }

    }

    public void reagir(int hora, int min){
        if(hora< 12){
            System.out.println("Abanar");
        }else if(hora>=18) {
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono)
            System.out.println("Abanar");
        else System.out.println("Latir");

    }
}
