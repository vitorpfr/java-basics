/*
    This is a comment.
    This program prints Hello world
 */

public class HelloWorld {
    public static final double PI = 3.14; // class constants
    public static final int MAX_SPEED = 80;

    public static void main(String[] args) {
        myFirstMethod();
    }

    // Create a method that prints Hello World
    public static void myFirstMethod() {
        String testString = "Hello World!1!"; // method variable
        System.out.println(testString);

        int testInt = 5;
        System.out.println(testInt);

        double testDouble = 3.14;
        System.out.println(testDouble);


        boolean testBoolean = true;
        System.out.println(testBoolean);

        System.out.println(MAX_SPEED);

        System.out.println(7 / 2); // int divided by int returns int (3)

        System.out.println("abc" + "def"); // concatenating strings

    }

}

