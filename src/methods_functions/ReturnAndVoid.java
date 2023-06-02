package methods_functions;

public class ReturnAndVoid {
    public static void main(String[] args) {

        System.out.println("--- Return ---");

        System.out.println(sum(1, 2));

        int result = sum(3, 5);
        int result2 = sum(3, 5) + sum(5, 7);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result + result2);

        System.out.println("--- Void ---");

        multiply(3, 5);
        multiply(2, 3);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void multiply(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

}
