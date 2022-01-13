package implemento;

import java.util.Objects;

public class Carro implements Comparable<Carro> {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {//Retorna o valor inteiro informando se os carros são iguais pela marca ou não
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

  /*  @Override
    public int compareTo(Carro o) {
        if(marca.length()<o.marca.length()){//Se o tamanho da String da outra marca for menor ela vai para direira e assim vai
            return -1;
        }else if(marca.length()>o.marca.length()) {
            return 1;
        }
        return 0;
    }*/

    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.marca);//Comparação da arvore por ordem  alfabética
    }
}
