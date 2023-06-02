package methods_functions;

public class OverloadingInMethods {
    public static void main(String[] args) {

        print();
        print(3);
        print(5);
        System.out.println(print(4, 2));
        System.out.println(print(3, 5));
        System.out.println(print(3, 5));
        System.out.println(print(7.3, 3));
        System.out.println(print(3.7, 4));

    }

    static void print() {
        System.out.println("Empty int");
    }

    static void print(int a) {
        System.out.println("Filled int: " + a);
    }

    static int print(int a, int b) {
        return a + b;
    }

    static double print(double a, int b) {
        return a * b;
    }

}
