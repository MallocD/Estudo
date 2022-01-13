package exceptions;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        while(true){

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {//Tratamento de exceções com o try, catch, finally//Tratamento de uma UncheckedException(Runtime)
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println(resultado);
                break;//Se o tratamneto conseguir impremir o valor, o break fara com que saia do código
            } catch (NumberFormatException e) {//NumberFormatException  Está tratando a exceção numérica do formato
//                e.printStackTrace();//Mostra a StackTrace
                JOptionPane.showMessageDialog(null, "Digite um valor numérico");
            } catch (ArithmeticException e) {//NumberFormatException  Está tratando a exceção numérica do Valor aritmético
                e.printStackTrace();//Mostra a StackTrace
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0");
            } finally {
                System.out.println("Ola");
            }
        }
    }

    static int dividir( int a, int b){
        return a/b;
    }
}
