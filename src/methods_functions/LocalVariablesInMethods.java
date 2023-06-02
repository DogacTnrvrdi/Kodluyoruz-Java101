package methods_functions;

public class LocalVariablesInMethods {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        sum(a, b);
        System.out.println("Main Method's a: " + a);

        dif();
    }

    static void sum(int a, int b) {
        a = 25;
        System.out.println("Sum Method's a: " + a);
    }

    static void dif() {
        int a = 15;
        System.out.println("Dif Method's a: " + a);
    }

}
