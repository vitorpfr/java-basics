import java.util.Random;
import java.util.Scanner;

public class OddsOrEvensSplit {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called \"Odds and Evens!\"");
        String playerName = getName();
        String playerOption = getOption(playerName);

        separate();

        int playerFingers = getPlayerFingers();
        int computerFingers = getComputerFingers();

        separate();

        String result = calculateResult(playerFingers, computerFingers);

        separate();

        determineWinner(playerOption, result);
    }

    // Get name
    public static String getName() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        return input.next();
    }

    // Get option (odds or evens) - keep asking until player chooses valid option
    public static String getOption(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi " + name + ", do you choose odds or evens?");
        String option = "";
        while (!option.equals("odds") && !option.equals("evens")) {
            option = input.next();
        }
        return option;
    }

    // Separate sections
    public static void separate() {
        System.out.println("-------------------------------");
    }

    // Ask player choice
    public static int getPlayerFingers() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many \"fingers\" do you put out?");
        return input.nextInt();
    }

    // Get computer choice
    public static int getComputerFingers() {
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\"");
        return computer;
    }

    // Calculates who won the game and prints result
    public static String calculateResult(int player, int computer) {
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
        return result;
    }

    // Determine winner
    public static void determineWinner(String option, String result) {
        if (option.equals(result)) {
            System.out.println("You won!");
        } else {
            System.out.println("The computer won...");
        }
    }

}
