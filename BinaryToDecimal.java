/* 4. Write a Java program to convert a binary number to decimal number */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binary = input.next();

        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);

        input.close();
    }
}