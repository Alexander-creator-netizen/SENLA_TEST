import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The task of finding the numbers of palindromes.
 */
public class Task5 {

    public static void main(String[] args) {
        List<Integer> palindromes = new ArrayList<>();
        int num = getNumber();
        for (int i = 0; i <= num; i++) {
            if (isPalindrome(i)) {
                palindromes.add(i);
            }
        }
        System.out.println("Found " + palindromes.size() + " palindromes: " + palindromes.toString());
    }

    /**
     * Gets number from user.
     * The number cannot be less than 0 and more than 100.
     *
     * @return entered number
     */
    private static int getNumber() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            try {
                int num = scan.nextInt();
                if (num < 0 || num > 100) {
                    System.out.println("Wrong input value. Enter a number from 0 to 100.");
                } else {
                    return num;
                }
            } catch (Exception e) {
                System.out.println("Wrong input value.");
            }
        }
    }

    /**
     * Checks if a number is a palindrome.
     * The number cannot be less than 0 and more than 100.
     *
     * @param number value to check
     * @return true if number is palindrome
     */
    private static boolean isPalindrome(int number) {
        if (number < 10) {
            return true;
        } else {
            return number / 10 == number % 10;
        }
    }
}

