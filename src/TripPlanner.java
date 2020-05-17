/*
This is the project 1 of Microsoft's Learn to Program in Java course, available on edX
 */

import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {
        greet();
        planTravelTimeAndBudget();
        timeDifference();
    }

    // Greets the user, asking for his name and destination
    public static void greet() {
        // Asks for name
        Scanner input = new Scanner(System.in);
        System.out.print("Hello! What is your name? ");
        String name = input.nextLine();

        // Prints name and asks for destination
//        System.out.println();
        System.out.print("Nice to meet you " + name + "! Where are you traveling to? ");
        String destination = input.nextLine();

        // Prints destination
        System.out.println("Great, " + destination + " sounds like a fun place!");
        System.out.println("****************************");
    }

    // a
    public static void planTravelTimeAndBudget() {
        // Asks for travel time
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to stay there? ");
        int travelTimeDays = input.nextInt();

        // Asks for budget in USD
        System.out.print("What is your budget in USD? ");
        int budget = input.nextInt();

        // Asks for user currency symbol
        System.out.print("What is local currency symbol? ");
        String currencySymbol = input.next();

        // Asks for the conversion rate between USD and user's currency symbol
        System.out.print("What is the conversion rate between USD and " + currencySymbol + "? (ex: 1 USD = ?? " + currencySymbol + ") ");
        double conversionRate = input.nextDouble();

        // Tell user how many days/hours/seconds he will stay at his destination
        int travelTimeHours = travelTimeDays * 24;
        int travelTimeMinutes = travelTimeHours * 60;
        System.out.println("You're staying there " + travelTimeDays + " days, or " + travelTimeHours + " hours, or " + travelTimeMinutes + " seconds!");

        // Calculate daily budgets and pass to user
        String dailyBudget = String.format("%.2f", (double)budget / travelTimeDays); // formats dailyBudget to decimal 2 places
        double budgetInLocalCurrency = (double)budget * conversionRate;
        String dailyBudgetInLocalCurrency = String.format("%.2f", budgetInLocalCurrency / travelTimeDays); // formats dailyBudget to decimal 2 places
        System.out.println("Your total budget is " + budget + " USD, and you can spend " + dailyBudget + " USD per day.");
        System.out.println("Converting to local currency, your total budget is " + budgetInLocalCurrency + " " + currencySymbol + ", and you can spend " + dailyBudgetInLocalCurrency + " " + currencySymbol + " per day.");
        System.out.println("****************************");
    }

    // Calculates time in destination when it's noon and midnight at home
    public static void timeDifference() {
        // Ask time idff
        Scanner input = new Scanner(System.in);
        System.out.println("Please tell me the time difference between your home and your destination: ");
        int timeDiff = input.nextInt();

        // Calculate diff and shows to user
        int midnightHourInDestination = (24 + timeDiff) % 24;
        int noonHourInDestination = (12 + timeDiff) % 24;
        System.out.println("When it's midnight home, it will be " + midnightHourInDestination + ":00 there");
        System.out.println("When it's noon home, it will be " + noonHourInDestination + ":00 there");
    }

    public static void
}
