package implemento;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSet =new HashSet<>();

        hashSet.add(new Carro("Azoi"));
        hashSet.add(new Carro("Bavar"));
        hashSet.add(new Carro("Ruma"));
        hashSet.add(new Carro("Mo"));
        hashSet.add(new Carro("Ign"));
        hashSet.add(new Carro("tIM"));

        System.out.println(hashSet);

        Set<Carro> treeSet = new TreeSet<>();//Setagem por sistema de Arvore é necessário implementar o método compareTo();

        treeSet.add(new Carro("Azoi"));
        treeSet.add(new Carro("Bavar"));
        treeSet.add(new Carro("Ruma"));
        treeSet.add(new Carro("Mo"));
        treeSet.add(new Carro("Ign"));
        treeSet.add(new Carro("tIM"));

        System.out.println(treeSet);
        /*List<Carro> listCa = new ArrayList<>();

        listCa.add(new Carro("Ford"));
        listCa.add(new Carro("Alo"));
        listCa.add(new Carro("Gol"));
        listCa.add(new Carro("Pamp"));

        System.out.println(listCa);
        System.out.println(listCa.get(3));//Pega o valor contido dentro do index 3 da lista

        System.out.println(listCa.indexOf(new Carro("Alo")));//Procura na lista o index do objeto informado por meio do indexOf;

        System.out.println("Carro removido: " +listCa.remove(2));//Remove o elemento pelo index
        System.out.println(listCa);*/

        /*Queue<Carro> queuCar = new LinkedList<>();

        queuCar.add(new Carro("Ford"));//Adiciona objetos a fila
        queuCar.add(new Carro("Pegout"));
        queuCar.add(new Carro("Mac"));
        queuCar.add(new Carro("Gol"));

        System.out.println(queuCar);
        System.out.println(queuCar.offer(new Carro("GOLF")));//offer informa se foi possível ou não adicionar o objeto retonarndo true ou falso;

        System.out.println(queuCar.peek());//Retorna o valor do primeiro carro da fila assim como first porém não o apaga

        System.out.println(queuCar);

        System.out.println(queuCar.poll());//Retira o primeiro valor da fila assim como dequeue

        System.out.println(queuCar);

        System.out.println(queuCar.isEmpty());//Verifica se está vazia

        System.out.println(queuCar.size());//Retorna o tamanho da fila*/





        /*Stack<Carro> stackCarros = new Stack<>();//Instancia a classe Pilhas(Stack) e pega o tipo carros(Classe do tipo objeto);

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Uno"));
        stackCarros.push(new Carro("Gol"));

        System.out.println(stackCarros);
        stackCarros.pop();//Retira o ultimo carro a entrar na pilha
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());//Mostra o valor que está no topo*/

       /* List<Carro> lista = new ArrayList<>();

       lista.add(new Carro("Uno"));
       lista.add(new Carro("Gol"));
       lista.add(new Carro("Pampa"));

        System.out.println(lista.contains(new Carro("Uno")));//Estou questionando se dentro da minha lista contain um objeto uno
        //Assim irá passar esse objeto para o equals ele irá realizar a comparação de objetos contidos dentro da lista e assim o hashCode irá retornar a resposta

        System.out.println(new Carro("Ford").hashCode());//Retorna o hashCode do objeto Ford, assim sendo unico

        Carro c1 = new Carro("Pajero");
        Carro c2 = new Carro("Pajero");

        System.out.println(c1.equals(c2));//Verificando se o hashCode do objeto é igual ao do outro*/

    }
}
