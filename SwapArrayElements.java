/* 10. Write a Java program to swap the first and last elements of an array and create a 
new array */

import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(array));

        swapFirstLast(array);

        System.out.println("Swapped array: " + Arrays.toString(array));
    }

    static void swapFirstLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }
}