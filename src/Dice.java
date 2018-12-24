import java.util.Random;
import java.util.Scanner;

public class Dice {

    public void roll() {
        // Create a new random number generator
        Random rand = new Random();
        // Get a random number 1-6
        double randNum = Math.floor(rand.nextInt(6) + 1);
        // Convert randNum to int
        int randInt = (int)randNum;

        // Create a Scanner object to get input from CL
        Scanner sc = new Scanner(System.in);
        // Ask for user input
        System.out.println("Would you like to roll the di? (y/n)");
        // Assign user input to variable
        String userInput = sc.next();

        // If user indicated they want to roll di
        if (userInput.equals("y")) {
            // Show a random number 1-6
            System.out.println("You rolled a " + randInt);
            // Otherwise print 'OK'
        } else System.out.println("OK");
    }
}
