public class DiceRollem {
    public static void main(String[] args) {
        // Create 5 new dice.
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        Dice dice4 = new Dice();
        Dice dice5 = new Dice();

        int allEqual = 0; // Accumulator variable.

        for (int i = 0; i < 1000; i++) { // Runs 1000 iterations.
            dice1.roll();
            dice2.roll();
            dice3.roll();
            dice4.roll();
            dice5.roll();

            if (dice1.diceVal == dice2.diceVal && 
            dice1.diceVal == dice3.diceVal &&
            dice1.diceVal == dice4.diceVal &&
            dice1.diceVal == dice5.diceVal) {
                System.out.println("Roll number " + i + " all dice show" + dice1.diceVal + ".");
                allEqual++;
            }
        }
        System.out.println("A total of " + allEqual + "tosses were the same.");
    }
}
