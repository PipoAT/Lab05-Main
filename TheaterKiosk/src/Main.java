import java.util.Scanner; // import scanner for user input

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // initialize scanner to read user input
        Scanner in = new Scanner(System.in);

        // declare variables
        int age = 0; // user input for age
        String trash = ""; // for if user inputs invalid type

        // output for user input
        System.out.println("Please input your age: ");

        if(in.hasNextInt()) {
            age = in.nextInt(); // set age variable to user input
            if (age >= 21) {
                // if age is 21 or older, output they need wristband
                System.out.println("You will get a wristband.");
            }
                // if under 21, nothing occurs
        } else {
            // if user inputs an invalid type of input, output error
            trash = in.nextLine();
            System.out.println("You inputted your age as: " + trash);
            System.out.println("Please rerun program and enter age (int).");
        }
    }
}