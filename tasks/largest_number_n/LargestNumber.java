package tasks.largest_number_n;

import java.io.Console;

public class LargestNumber {
    public static void main(String[] args) {
        Console console = System.console();
        String response = "";

        do {
            String number = console.readLine("Please enter a number to calculate max amount.\n");
            System.out.println("Max amount of entered number is:");
            System.out.println(Math.pow(10, number.length()) - 1);

            response = console.readLine("Do You want to try again? y/n\n");
        }
        while (response.toString().equals("y") || response.toString().equals("Y"));
    }
}