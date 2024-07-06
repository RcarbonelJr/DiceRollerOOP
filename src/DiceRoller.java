/* Author: Randall Carbonel
 * Date: 7/6/24
 * Class: ASD216 - Java Programming
 * Assignment: Create an application that rolls a pair of six-sided dice with an OOP approach.
 * Specifications:
 *      - Create a class named Die to store the data about each die. This class should contain these constructors and
 *        methods:
 *          - public Die()
 *          - public void roll()
 *          - public int getValue()
 *      - Create a class named Dice to store two dice. This class should contain two instance variables of the Die type
 *        and these constructors and methods:
 *          - public Dice()
 *          - public int getDie1Value ()
 *          - public int getDie2Value ()
 *          - public int getSum()
 *          - public void roll()
 *          - public void printRoll()
 *      - When printing the results of the roll of the dice, display the value of each die and the total. In addition,
 *        display special messages for craps (sum of both dice is 7), snake eyes (double 1’s), and box cars (double 6’s)
 *      - Continue only if the user enters “y” or “Y” at the “Roll again?” prompt
 */

import java.util.Scanner;

public class DiceRoller {

    // Greeter
    private static void greeter() {
        System.out.println();
        System.out.println("Welcome to the Dice Roller!");
        System.out.println();
    }

    // Special Messages
    public static void specialMessages(Dice dice) {
        switch (dice.getSum()) {
            case 2:
                System.out.println("Snake eyes!");
                break;
            case 7:
                System.out.println("Craps!");
                break;
            case 12:
                System.out.println("Boxcars!");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {

        // Greeter
        greeter();

        // Create the Scanner
        Scanner sc = new Scanner(System.in);

        // Create the dice
        Dice dice = new Dice();

        // Ask the user if they would like to roll the dice
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.nextLine();

        // While loop so the program runs until the user exits
        while (choice.equalsIgnoreCase("y")) {

            // Roll the dice
            dice.roll();

            // Print the results and any special messages
            dice.printRoll();
            specialMessages(dice);

            // Ask the user if they would like to roll again
            System.out.print("Roll again? (y/n): ");
            choice = sc.nextLine();
        }
    }
}
