/* 3. Write a Java program to convert a decimal number to binary numbers */

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        int decimal = input.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary: " + binary);

        input.close();
    }
}