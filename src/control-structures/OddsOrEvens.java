import java.util.Random;
import java.util.Scanner;

public class OddsOrEvens {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called \"Odds and Evens!\"");

        // Get name
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.next();

        // Get option (odds or evens) - keep asking until player chooses valid option
        System.out.println("Hi " + name + ", do you choose odds or evens?");
        String option = "";
        while (!option.equals("odds") && !option.equals("evens")) {
            option = input.next();
        }

        // Print result of choice
        if (option.equals("odds")) {
            System.out.println(name + " has picked odds. The computer will be evens.");
        } else if (option.equals("evens")) {
            System.out.println(name + " has picked evens. The computer will be odds.");
        }

        // Separate
        System.out.println("-------------------------------");

        // Ask player choice
        System.out.println("How many \"fingers\" do you put out?");
        int player = input.nextInt();

        // Tell computer choice
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\"");

        // Separate
        System.out.println("-------------------------------");

        // Determine if sum is even or odd
        int sum = player + computer;
        String result = "";
        boolean isEven = sum % 2 == 0;
        if (isEven) {
            result = "evens";
        } else {
            result = "odds";
        }

        System.out.println(player  + " + " + computer + " is... " + sum + ", and the result is: " + result);

        // Separate
        System.out.println("-------------------------------");

        // Determine winner
        if (option.equals(result)) {
            System.out.println("You won!");
        } else {
            System.out.println("The computer won...");
        }

    }

}
