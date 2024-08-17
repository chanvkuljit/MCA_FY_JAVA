/* 13. Write a Java program to add two numbers without using any arithmetic 
operators */

import java.util.Scanner;

public class AddWithoutArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("Sum: " + addWithoutArithmetic(x, y));

        input.close();
    }

    static int addWithoutArithmetic(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
}