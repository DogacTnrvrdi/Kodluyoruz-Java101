package variables;

public class Integer {
    public static void main(String[] args) {

        System.out.println("---------------------- Integer ----------------------");

        // Integer <data type> <variable name> = data (value)
        int numberOne, numberTwo = 2;
        numberOne = 1;

        int numberThree = numberOne + numberTwo;
        System.out.println(numberThree);

        System.out.println("-----");

        // Calculating the area and perimeter of a rectangle
        int lenght = 20, breadth = 10;

        int area = lenght * breadth;
        int perimeter = 2 * (lenght + breadth);

        System.out.println(area);
        System.out.println(perimeter);

        System.out.println("-----");

        byte variableByte = 127; // 8 bit -> 1 byte
        short variableShort = 32767; // 16 bit -> 2 byte
        int variableInt = 2147483647; // 32 bit -> 4 byte
        long variableLong = 9223372036854775807L; // 64 bit -> 8 byte

        System.out.println(variableByte);
        System.out.println(variableShort);
        System.out.println(variableInt);
        System.out.println(variableLong);
    }
}
