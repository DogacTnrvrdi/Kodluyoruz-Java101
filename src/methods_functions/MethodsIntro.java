package methods_functions;

public class MethodsIntro {

    static int power(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        helloFunctions();

        System.out.println(power(2, 3));
        System.out.println(power(3, 5));

    }

    static void helloFunctions() {
        System.out.println("Hello functions!");
    }
}
