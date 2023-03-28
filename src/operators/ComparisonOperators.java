package operators;

public class ComparisonOperators {
    public static void main(String[] args) {

        int a = 5, b = 2;

        boolean equal = (a == b);
        boolean notEqual = (a != b);
        boolean lessThan = (a < b);
        boolean greaterThan = (a > b);
        boolean lessThanOrEqual = (a <= b);
        boolean greaterThanOrEqual = (a >= b);

        System.out.println(equal);
        System.out.println(notEqual);
        System.out.println(lessThan);
        System.out.println(greaterThan);
        System.out.println(lessThanOrEqual);
        System.out.println(greaterThanOrEqual);
    }
}
