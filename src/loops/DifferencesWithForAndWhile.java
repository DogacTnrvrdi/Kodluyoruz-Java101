package loops;

import java.util.Scanner;

public class DifferencesWithForAndWhile {
    public static void main(String[] args) {

        // Create variables
        int number;

        // Define Scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("--- For Loop ---");

        for (boolean run = true; run; ) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number < 0) {
                run = false;
            }
        }

        System.out.println("--- While Loop ---");

        System.out.print("Enter a number: ");
        number = input.nextInt();
        while (number > 0) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println("--- Do-While Loop ---");

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
        } while (number > 0);

        System.out.println("------------------\n");

        System.out.println("--- For Loop ---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("--- While Loop ---");

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
