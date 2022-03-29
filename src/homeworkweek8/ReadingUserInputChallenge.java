package homeworkweek8;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        // create scanner object
        Scanner Scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println(" Enter number#" + count);

            boolean validateNumber = Scanner.hasNextInt();
            if (validateNumber) {
                int number = Scanner.nextInt();

                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");

            }
            //always return new userInput
            Scanner.nextLine();
        }
        System.out.println("Sum of all numbers = + Sum");
        Scanner.close();
    }
}
