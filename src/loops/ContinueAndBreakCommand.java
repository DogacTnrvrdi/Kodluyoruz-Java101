package loops;

public class ContinueAndBreakCommand {
    public static void main(String[] args) {

        System.out.println("--- For Loop - Break Command ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Found 5");
                break;
            }
        }

        System.out.println("\n--- For Loop - Continue Command ---");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n--- While Loop - Continue Command ---");

        int i = 0;
        while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // Same in Do-While

        System.out.println("\n--- Test ---");

        for (int k = 1; k <= 2; ++k) {
            for (int j = 1; j < 4; ++j) {
                if (k == 1)
                    continue;
                System.out.print(k + j);
            }
        }
    }
}
