import java.util.Random;

public class UsingArrayTest {
    public void test() {
        int[] data = new int[10];
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
    }
}
