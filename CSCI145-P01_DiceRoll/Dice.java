import java.util.Random;

public class Dice {
    int diceVal;

    public void roll() {
        Random randomNum = new Random();
        diceVal = randomNum.nextInt(6) + 1; // Creates a random number between 1 and 7, inclusive.
    }
}
