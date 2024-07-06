public class Dice {

    // Instance variables
    private final Die die1;
    private final Die die2;

    // Constructor
    public Dice() {
        die1 = new Die();
        die2 = new Die();
    }

    // Get the value of die1
    public int getDie1Value() {
        return die1.getValue();
    }

    // Get the value of die2
    public int getDie2Value() {
        return die2.getValue();
    }

    // Get the sum of die1 and die2
    public int getSum() {
        return getDie1Value() + getDie2Value();
    }

    // Roll both of the die
    public void roll() {
        die1.roll();
        die2.roll();
    }

    // Print out the value of each die
    public void printRoll() {
        System.out.println("Die 1: " + getDie1Value());
        System.out.println(("Die 2: " + getDie2Value()));
        System.out.println("Total: " + getSum());
    }
}