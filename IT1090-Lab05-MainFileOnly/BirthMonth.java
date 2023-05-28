import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // initialize the scanner to read user input
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
        int birthMonth = 0; // user input of birth month (1-12)
        String trash = ""; // for if user inputs invalid value

        // output and obtain user input
        System.out.println("Please enter your birth month (1 - 12): ");
        // checks for valid input
        if (in.hasNextInt()) {
            // reads and saves user input to variable
            birthMonth = in.nextInt();
            // checks if the input is between 1 and 12
            if (birthMonth >= 1 && birthMonth <= 12) {
                // valid input within range, displays output of birth month
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                // valid input out of range, displays error message.
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            // output for user to restart program and enter valid value
            trash = in.nextLine();
            System.out.println("Error: You declared birth month to be: " + trash);
            System.out.println("Restart program and enter valid input (int, 1-12)");
        }
    }
}