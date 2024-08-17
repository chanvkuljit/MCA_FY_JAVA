/* 7. Write a Java program to count the letters, spaces, numbers, and other characters 
of an input string */

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        input.nextLine(); // Consume newline
        String str = input.nextLine();

        int letters = 0, spaces = 0, numbers = 0, others = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isSpaceChar(c)) {
                spaces++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + others);

        input.close();
    }
}