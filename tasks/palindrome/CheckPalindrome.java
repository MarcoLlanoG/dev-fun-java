package tasks.palindrome;

import java.io.Console;

public class CheckPalindrome {
    public static void main(String[] args) {
        Console console = System.console();
        String response = "";

        do {
            char[] word = console.readLine("Please enter a string to check if it's palindrome.\n").toCharArray();
            int index = 0;
            boolean isPalindrome = false;

            for (int i = word.length - 1; i >= (word.length / 2); i--) {
                isPalindrome = word[i] == word[index];
                index++;
            }

            if (!isPalindrome) {
                System.out.print("Is not palindrome.");
            }
            System.out.print("Is palindrome.");

            response = console.readLine("Do You want to try again? y/n\n");
        } while (response.toString().equals("y") || response.toString().equals("Y"));
    }
}