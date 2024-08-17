/* 2. Write a Java program that takes five numbers as input to calculate and print the 
average of the numbers  */

import java.util.Scanner;

public class AverageOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += input.nextInt();
        }

        double average = sum / 5.0; // Calculate average as a double
        System.out.println("Average: " + average);

        input.close();
    }
}