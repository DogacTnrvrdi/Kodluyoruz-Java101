package conditionalexpressions;

public class If_Else {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 1;
        boolean compare = (a == b);

        if (compare) {
            a = 50;
            System.out.println("A number: " + a);
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        System.out.println("---------");

        if ((a < b) && (a < c)) {
            System.out.println("A is the smallest number.");
        } else if ((b < a) && (b < c)) {
            System.out.println("B is the smallest number.");
        } else {
            System.out.println("C is the smallest number.");
        }
    }
}
