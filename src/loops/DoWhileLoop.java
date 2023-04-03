package loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int password;
        boolean askPassword = true;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter your password: ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Correct!");
                askPassword = false;
            } else {
                System.out.println("Incorrect! Try again");
            }
        } while (askPassword);

        System.out.println("-----------------------\n");

        int i = 1, j = 1;
        while (i < 3) {
            do {
                System.out.print(j + ",");
                j++;
            } while (j < 4);
            i++;
        }
    }
}
