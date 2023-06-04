package classes;

public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    int increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit)
            speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrement) {
        if (speed > 0)
            speed -= decrement;
        return speed;
    }

    void printSpeed() {
        System.out.println("Your speed: " + speed);
    }

}
