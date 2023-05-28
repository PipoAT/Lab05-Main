import java.util.Scanner; // import scanner for user input

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // initialize scanner to obtain user input
        Scanner in = new Scanner(System.in);

        // declare variables
        String partyAffiliation = ""; // string variable to store user input for party affiliation
        String trash = ""; // for if user inputs an invalid type of input

        // output request and obtain user input
        System.out.println("Please enter party affiliation (R, D, I, Other): ");
        // checks for valid input from user
        if (in.hasNextLine()) {
            // sets the user input to variable
            partyAffiliation = in.nextLine();
            // checks for if the user input is R, D, I, or Other
            if (partyAffiliation.equals("R")) {
                // if republican, output the Elephant
                System.out.println("You get a Republican Elephant.");
            } else if (partyAffiliation.equals("D")) {
                // if democrat, output the donkey
                System.out.println("You get a Democratic Donkey.");
            } else if (partyAffiliation.equals("I")) {
                // if independent, output the person
                System.out.println("You get an Independent Person.");
            } else if (partyAffiliation.equals("Other")) {
                // if other, output other
                System.out.println("You get Other.");
            } else {
                // output invalid input
                System.out.println("You inputted an invalid input. Please rerun the program and enter (R, D, I, Other).");
            }

        } else {
            // if invalid type of input, output error message
            trash = in.nextLine();
            System.out.println("You inputted your party as: " + trash);
            System.out.println("Please rerun program and input a string.");
        }
    }
}