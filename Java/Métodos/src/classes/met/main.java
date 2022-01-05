package classes.met;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Calculadora
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o primeiro número: ");
        int n1= scan.nextInt();
        System.out.println("Escolha o segundo número: ");
        int n2= scan.nextInt();

        //Chamada da classe metodo e depois dos metodos
        metodos.soma(n1,n2);
        metodos.sub(n1,n2);
        metodos.divisao(n1,n2);
        //Chamada da classe junto com o método

        //Menssagem
        System.out.println("-----------------------------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");//Método para formatar horas local

        System.out.print("Agora são  " +(Integer.parseInt(dtf.format(LocalDateTime.now()))) + " horas, ");
        Message.obterMessage(Integer.parseInt(dtf.format(LocalDateTime.now())));

        //Empréstimo
        System.out.println("-----------------------------");
        System.out.println("Simulação de empréstimo");
        System.out.println("-----------------------------");
        System.out.println("Esta é uma simulação feita automaticante-->\nEmprestando um total de R$1000 e parcelando em 3x:");
        emprestimo.calcular(1000,emprestimo.getSimula());
        System.out.println("Agora vamos para sua simulação:");
        System.out.println("Qual valor deseja emprestar?");
        int em = scan.nextInt();
        System.out.println("Em quantas parcelas irá efetuar o pagamento desse empréstimo?");
        int np= scan.nextInt();

        System.out.println("O valor emprestado será de R$"+em+ " e pago em " +np + " parcelas, O valor a ser pago no total sera de: ");
        emprestimo.calcular(em,np);


    }
}
