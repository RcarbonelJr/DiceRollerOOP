public class Die {

    // Instance variables
    private int value;

    // Constructor
    public Die() {
        value = 0;
    }

    // "Set" method
    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }

    // Get method
    public int getValue() {
        return value;
    }
}