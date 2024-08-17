/* 8. Write a Java program to print the even and odd numbers from 1 to 20 by using 
call to two different methods belongs same super class */

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = input.nextInt();

        System.out.println("Enter the ending number:");
        int end = input.nextInt();

        printEvenNumbers(start, end);
        printOddNumbers(start, end);

        input.close();
    }

    static void printEvenNumbers(int start, int end) {
        System.out.println("Even numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void printOddNumbers(int start, int end) {
        System.out.println("Odd numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}