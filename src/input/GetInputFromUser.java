package input;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {

        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = input.nextInt();
        System.out.println(a);

        /*
        System.out.print("Type something: ");
        String str = input.nextLine();
        System.out.println(str);
         */
    }
}
