/* 5. Write a Java program and compute the sum of the digits of an integer */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = input.nextInt();

        int digitSum = 0;
        while (number != 0) {
            digitSum += number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits: " + digitSum);

        input.close();
    }
}