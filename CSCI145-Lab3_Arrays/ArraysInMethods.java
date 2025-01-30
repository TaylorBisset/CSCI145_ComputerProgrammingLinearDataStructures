import java.util.Random;

public class ArraysInMethods {
    public static void main(String[] args) {
        ArraysInMethods arrayInMethods = new ArraysInMethods();
        arrayInMethods.run();
    }
    
    public void run() {
        int[] data = new int[10];
        initArray(data, 100);
        printArray(data);
    }

    public void initArray(int[] array, int range) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % range;
        }
    }

    public void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.printf("%d ", arrayToPrint[i]);
        }
        System.out.println();
    }
}
