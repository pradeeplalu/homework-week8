package homeworkweek8;

import java.util.Scanner;

public class Program8 {
    // main method
    public static void main(String[] args) {
        // scanner object
        Scanner sc = new Scanner((System.in));
        int row;
        System.out.println("Enter size of triangle:");
        row = sc.nextInt();
        //nested for loop
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");

            }
            System.out.println();
        }
    }
}