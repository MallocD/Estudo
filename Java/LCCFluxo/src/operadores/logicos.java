package operadores;

import java.util.Scanner;

public class logicos {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2));//Ambos são true
        System.out.println("b1 && b3: " + (b1 && b3));//Ambos são true
        System.out.println("b1 || b2: " + (b1 || b2));//Pelo menos um é true
        System.out.println("b2 || b4: " + (b2 || b4));//Pelo menos um é true
        System.out.println("b1 ^ b3: " + (b1 ^ b3));//Ambas expressões opostas
        System.out.println("b1 ^ b2: " + (b2 ^ b1));//Ambas expressões opostas

        int i1 = 30;
        int i2 = 20;
        float f1 = 3.2f;
        float f2 = 20.5f;

        System.out.println("((i2+i1)<(f2-f1)) && true: " + (((i2 + i1) < (f2 - f1)) && true));
        System.out.println("((i2>i1)||(f2<f1)): " + ((i2 > i1) || (f2 < f1)));
    }

        public static void ifMenor() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual seu sálario mensal?");

            double salarioMensal = scan.nextDouble();
            double mediaSalarial = 1200.34;
            System.out.println("Quantas pessoas moram com você?");

            int quantidadeDependentes = scan.nextInt();
            int mediaDependentes = 3;

            System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes));

            boolean salarioBaixo = salarioMensal < mediaSalarial;
            boolean muitoDependentes = quantidadeDependentes >= mediaDependentes;

            System.out.println(salarioBaixo && muitoDependentes);

            String recebeAuxilio = salarioBaixo && muitoDependentes ? "Recebe auxílio" : "Não recebe auxílio";

            System.out.println(recebeAuxilio);

        }
    }


