package tasks.century_from_year;

import java.io.Console;

public class CenturyFromYear {
    public static void main(String[] args) {
        Console console = System.console();
        String response = "";

        do {
            String number = console.readLine("Please enter a year number to calculate its century.\n");

            if (number.length() < 3) {
                System.out.println("Century is 1");
            }
            else {
                int century = Integer.parseInt(number.substring(0, number.length() - 2)) + 1;
                System.out.print("Century is: ");
                System.out.println(century);
            }
            response = console.readLine("Do You want to try again? y/n\n");
        }
        while (response.toString().equals("y") || response.toString().equals("Y"));
    }
}