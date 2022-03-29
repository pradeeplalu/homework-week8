package homeworkweek8;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        // create a scanner object

        Scanner in = new Scanner(System.in);
        System.out.println("input an alphabet");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")// check alphabet
                || input.equals("o") || input.equals("u");
        if (input.length() > 1) {
            System.out.println("Error. Not a single charactrer.");
        } else if (!(uppercase || lowercase)) {//upper case and lower case
            System.out.println("Error.Not a letter. Enter uppercase or lowercase letter.");

        } else if (vowels) {
            System.out.println("Input letter is vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}