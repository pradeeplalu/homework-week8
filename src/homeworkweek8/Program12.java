package homeworkweek8;

import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number"); //prime number can be divided by itself only
        } else {
            System.out.println(n + " is not a prime number");// can be divided by other numbers
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // condition for prime
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


