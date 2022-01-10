package exercicios;

public class Interruptores {
    public static void main(String[] args) {
//Fazer um for de 1 até 14, sendo que somente múltiplos de 2 sejam listados
//Entretando, quando o loop passar pelo 12, o mesmo deve ser abortado.
        int i = 1;

        for(i = 1; i<15; i++){
            if(i%2==0){
                if(i==12)break;
                System.out.println(i);
            }
        }

        while(true){
            if(i%2==0)
                if(i==12)break;
            else
                System.out.println(i);
                i++;
            }

        }
    }




