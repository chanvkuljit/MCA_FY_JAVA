/* 14. Write a Java program to add all the digits of a given positive integer  */

import java.util.Scanner;

public class SumOfDigitsRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int positiveInt = input.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(positiveInt));

        input.close();
    }

    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 10) + sumOfDigits(num / 10);
        }
    }
}