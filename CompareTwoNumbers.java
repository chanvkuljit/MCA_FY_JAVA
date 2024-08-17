/* 6. Write a Java program to compare two numbers  */

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }

        input.close();
    }
}