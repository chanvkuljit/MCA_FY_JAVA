/* 11. Write a Java program to count the number of even and odd elements in a given 
array */

public class CountEvenOddArray {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6};

        countEvenOdd(numbersArray);
    }

    static void countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even elements: " + evenCount);
        System.out.println("Odd elements: " + oddCount);
    }
}