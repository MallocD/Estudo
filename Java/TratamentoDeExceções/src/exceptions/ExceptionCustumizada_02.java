package exceptions;

import javax.swing.*;

public class ExceptionCustumizada_02 {
    public static void main(String[] args) {
        int[] numerador = {4, 3, 4, 8};
        int[] denominador = {2, 2, 0, 2, 0};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Valor quebrado", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println("Valor[" + i + "] : " + resultado);

            } catch (ArithmeticException x) {//Trata a exception de dividir um numero por 0
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0");
            } catch (DivisaoNaoExataException e) {//Trata a exception personalizada de um numero que seja impar pois irá retornar um valor quebrado
                JOptionPane.showMessageDialog(null, "Numero irá retornar um valor int quebrado");
//                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException a) {//Trata a exception de caso não exista o index na array
                JOptionPane.showMessageDialog(null, "Numerador nulo");
            }

        }
        System.out.println("O programa continua");
    }
}