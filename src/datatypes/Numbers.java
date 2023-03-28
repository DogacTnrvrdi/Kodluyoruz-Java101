package datatypes;

public class Numbers {
    public static void main(String[] args) {

        System.out.println("---------------------- Integer ----------------------");

        // Integer <data type> <variable name> = data (value)
        int numberOne, numberTwo = 2;
        numberOne = 1;

        int numberThree = numberOne + numberTwo;
        System.out.println(numberThree);

        System.out.println("------");

        // Calculating the area and perimeter of a rectangle
        int lenght = 20, breadth = 10;

        int area = lenght * breadth;
        int perimeter = 2 * (lenght + breadth);

        System.out.println(area);
        System.out.println(perimeter);

        System.out.println("----- Byte, Short, Int, Long -----");

        byte variableByte = 127; // 8 bit -> 1 byte
        short variableShort = 32767; // 16 bit -> 2 byte
        int variableInt = 2147483647; // 32 bit -> 4 byte
        long variableLong = 9223372036854775807L; // 64 bit -> 8 byte

        System.out.println(variableByte);
        System.out.println(variableShort);
        System.out.println(variableInt);
        System.out.println(variableLong);

        System.out.println("--------- Float,Double ---------");

        float variableFloat = 3.14f; // 3.4*10^38 - 1.4*10^-45 ------ 32 bit -> 4 byte
        double variableDouble = 41.3d; // 1.8*10^308 - 4.9*10^-324 ------ 64 bit -> 8 byte

        System.out.println(variableFloat);
        System.out.println(variableDouble);
    }
}
