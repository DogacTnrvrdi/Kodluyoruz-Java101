package methods_functions;

public class RecursiveMethods {
    public static void main(String[] args) {
        System.out.println(f(3));
        // f(1) = 1
        // f(2) = 1 + 2 -> f(1) + 2
        // f(3) = 1 + 2 + 3 -> f(2) + 3
        // f(4) = 1 + 2 + 3 + 4 -> f(3) + 4
        //f(n) = f(n - 1) + n
    }

    static int f(int n) {
        if (n == 1)
            return 1;
        return f(n - 1) + n;
    }

}
