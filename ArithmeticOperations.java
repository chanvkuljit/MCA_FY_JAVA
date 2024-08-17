/* 1. Write a Java program to print the sum, multiply, subtract, divide and remainder 
of two numbers */
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Multiply: " + (num1 * num2));
        System.out.println("Subtract: " + (num1 - num2));
        System.out.println("Divide: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));

        input.close();
    }
}