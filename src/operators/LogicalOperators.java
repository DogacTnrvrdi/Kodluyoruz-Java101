package operators;

public class LogicalOperators {
    public static void main(String[] args) {

        int a = 5, b = 2, c = 5;

        boolean condition1 = (a == c);
        boolean condition2 = (a >= b);

        // AND Operator -> &&
        boolean result = condition1 && condition2;
        System.out.println(result);

        // OR Operator -> ||
        System.out.println(condition1 || condition2);

        // NOT Operator -> !
        System.out.println(!result);
    }
}
