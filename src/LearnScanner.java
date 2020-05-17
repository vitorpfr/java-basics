import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("What is your name?");
        String name = input.next(); // gets first word, input.nextLine() would get whole sentence
        System.out.println("Hello " + name);

        System.out.println("Please type a number:");
        int number = input.nextInt();
        System.out.println("Number chosen: " + number);
    }

}
