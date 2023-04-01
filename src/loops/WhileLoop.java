package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1, k;

        System.out.println("Program Start");

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("Program End");

        System.out.println("-----------------------\n");

        System.out.println("Program Start");

        i = 1;

        while (i <= 5) {
            System.out.println(i);
            k = 1;
            while (k <= 10) {
                System.out.print(k + ", ");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Program End");

        System.out.println("-----------------------\n");

        int left = 100, right = 200;

        while (++left < --right) ;
        System.out.println(left);

        System.out.println("-----------------------\n");

        int password;
        boolean isPasswordCorrect = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordCorrect) {
            System.out.print("Enter your password: ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Correct!");
                isPasswordCorrect = true;
            } else {
                System.out.println("Incorrect! Try again.");
            }
        }
    }
}
