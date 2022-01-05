package classes.met;

public class Message {

    public static void obterMessage(int hora){
        if(hora<=5){
            messageMadruga();
        }
        else if(hora<=12){
            messageDia();
        }
        else if(hora<=17){
            messageTarde();
        }
        else if(hora<=24){
            messageNoite();
        }
    }
    private static void messageMadruga(){
        System.out.println("Boa Madrugada !!");
    }private static void messageDia(){
        System.out.println("Bom dia!!");
    }private static void messageTarde(){
        System.out.println("Boa tarde!!");
    }private static void messageNoite(){
        System.out.println("Boa Noite!!");
    }
}
