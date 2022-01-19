
public class Testar {
    static int i = 1;
    static int  j = 9;

    public static void main(String[] args) {

        System.out.println(i);
        InnerClass.printNum();

        Teste t = new Teste();
        t.setX(3);
    }

    public static class InnerClass {
        public static void printNum() {
            System.out.println(i);
            System.out.println(j);
        }
    }
}