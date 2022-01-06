package classes.met;

public class emprestimo {


    public static int getSimula() {
        return 3;
    }

    public static double getDuasPar() {

        return 0.15;
    }

    public static double getQuaPar() {

        return 0.55;
    }

    public static double getMaiorPar() {

        return 0.75;
    }


    public static void calcular(double valor, int parcelas) {
        if (parcelas <= 3) {
            double valorF = valor + (valor * getDuasPar());
            double valorP = valorF / parcelas;

            System.out.println("R$" + valorF);
            System.out.println("Será pago em " + parcelas + "x" + " de" + " R$" + valorP);

        } else if (parcelas <= 6) {
            double valorF = valor + (valor * getQuaPar());
            double valorP = valorF / parcelas;

            System.out.println("R$" + valorF);
            System.out.println("Será pago em " + parcelas + "x" + " de" + " R$" + valorP);
        } else {
            double valorF = valor + (valor * getMaiorPar());
            double valorP = valorF / parcelas;

            System.out.println("R$" + valorF);
            System.out.println("Será pago em " + parcelas + "x" + " de" + " R$" + valorP);
        }

    }

}