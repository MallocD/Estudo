package exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeArqui = "Exceçõe.txt";



        try {
            imprimirConsole(nomeArqui);
        }catch (FileNotFoundException a){//Se o nome do arquivo não for encontrado retorna uma exception assim a gente resolve com o FileNotFoundException
           JOptionPane.showMessageDialog(null,"Digite o nome do arquivo desejado corretamente");
        }
        catch (IOException e) {//Engloba mais possibilidades de erros pois é mãe de FileNotFoundException
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, entre em contato com o suporte!!");
        }finally {

        System.out.println("Apesar de exception ou não o programa continua");
        }


    }

    public static void imprimirConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}