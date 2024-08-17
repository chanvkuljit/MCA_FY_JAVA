/* 9. Write a Java program to compute the sum of the first 100 prime numbers  */

public class SumOfPrimes {
    public static void main(String[] args) {
        int count = 0, num = 2, sum = 0;
        while (count < 100) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of first 100 prime numbers: " + sum);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}