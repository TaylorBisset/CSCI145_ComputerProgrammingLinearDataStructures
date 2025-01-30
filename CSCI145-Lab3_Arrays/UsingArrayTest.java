import java.util.Random;

public class UsingArrayTest {
    public static void main(String[] args) {
        UsingArrayTest testArray = new UsingArrayTest();
        testArray.test();
    }

    public void test() {
        int arraySize = 20;
        int[] data = new int[arraySize];
        Random random = new Random();
        
        // Initializes array
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt() % 100;
        }
        
        // Print array
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }
        
        System.out.println();

        // Reverse array
        int[] tempData = new int[arraySize];
        for (int i = 0; i < data.length; i++) {
            tempData[i] = data[data.length - 1 - i];
            tempData[data.length - 1 - i] = data[i];
        }

        // Print reversed array
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d ", tempData[i]);
        }

    }
}
