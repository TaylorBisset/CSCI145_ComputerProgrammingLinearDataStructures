// ArraysInMethods.java

// Author: Taylor Bisset
// Description: Lab 3, CSCI 145
// Date: Jan 29,2025

import java.util.Random;

public class ArraysInMethods {
    public static void main(String[] args) {
        ArraysInMethods arrayInMethods = new ArraysInMethods();
        arrayInMethods.run();
    }

    public void run() {
        int arraySize = 20;
        int[] data = new int[arraySize];
        initArray(data, 100);
        printArray(data);
        int max = findMax(data);
        int min = findMin(data);
        System.out.printf("max = %d%n", max);
        System.out.printf("min = %d%n", min);
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

    public int findMax(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public int findMin(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}
