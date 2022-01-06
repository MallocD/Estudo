package operadores;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class fluxos {
    public static void main(String[] args) {
        ferias();
        numero();
        logicos.ifMenor();

    }

       private static String diaSemana() {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o nome do dia da semana:");
            String diaS = scan.nextLine();

           switch (diaS) {
               case "Domingo" -> System.out.println("Dia 1");

               case "Segunda" -> System.out.println("Dia 2");

               case "Terça" -> System.out.println("Dia 3");

               case "Quarta" -> System.out.println("Dia 4");

               case "Quinta" -> System.out.println("Dia 5");

               case "Sexta" -> System.out.println("Dia 6 ");

               case "Sábado" -> System.out.println("Dia 7");

               default -> System.out.println("Dia não existente, verifique se digitou corretamente\ne tente novamente!");
           }
           return diaS;
       }

       private static void numero(){
        String dia = diaSemana();

           switch (dia) {//Maneira mais fácil e organizada de programar um switch
               case "Domingo", "Segunda", "Terça" -> System.out.println("Certo");
               case "Quinta" -> System.out.println("Talvez");
               case "Sexta" -> System.out.println("Errado");
               case "Sábado" -> System.out.println("Valor indefinido");
           }

       }

       private static int ifMes(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Digite o número de algum mês: ");
            int mes = scan.nextInt();

            if (mes == 1) {
                System.out.println("Janeiro");
            } else if (mes == 2) {
                System.out.println("Fevereiro");
            } else if (mes == 3) {
                System.out.println("Março");
            } else if (mes == 4) {
                System.out.println("Abril");
            } else if (mes == 5) {
                System.out.println("Maio");
            } else if (mes == 6) {
                System.out.println("Junho");
            } else if (mes == 7) {
                System.out.println("Julho");
            } else if (mes == 8) {
                System.out.println("Agosto");
            } else if (mes == 9) {
                System.out.println("Setembro");
            } else if (mes == 10) {
                System.out.println("Outubro");
            } else if (mes == 11) {
                System.out.println("Novembro");
            } else if (mes == 12) {
                System.out.println("Dezembro");
            } else {
                System.out.println("Mês inválido");

            }
           return mes;
       }

       private static void ferias(){
        int mes = ifMes();

        switch (mes){//Maneira mais simples de programar switch
            case 1,2,12 ->System.out.println("Boas férias");
            default -> System.out.println("Bom trabalho!!");
            /*case 1 ://Maneira tradicional
            case 2 :
            case 12 :
                System.out.println("Boas férias");
                break;
            default:
                System.out.println("Bom trabalho!!");*/


        }
    }
}








