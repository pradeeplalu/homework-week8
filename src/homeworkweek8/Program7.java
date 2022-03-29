package homeworkweek8;

import java.util.Scanner;

public class Program7 {
    static int sumFirstAndLastDigits(int number) {
        int first = number;
        int last = number % 10;//last digit
        for (first = number; first >= 10; first = first / 10) ;
        return first + last;//method return
    }


    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Ente number: ");
        int number = keyBoard.nextInt();
        System.out.println("The sum of the first and Last digis: " + sumFirstAndLastDigits(number));
        keyBoard.close();
    }
}

