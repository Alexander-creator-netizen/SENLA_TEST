import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Task finds GCD and LCM of two integers.
 */
public class Task2 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer:");
        try {
            int a = input.nextInt();
            System.out.println("Please enter the second integer:");
            int b = input.nextInt();
            System.out.println("The GCD of " + a + " and " + b + " is " + getGcd(a, b) + ".");
            System.out.println("The LCM of " + a + " and " + b + " is " + getHcf(a, b) + ".");
        } catch (InputMismatchException e) {
            System.out.println("Entered the incorrect number");
        }
    }

    /**
     * Count the greatest common divisor.
     *
     * @param a the first specified number.
     * @param b the second specified number.
     * @return the received value of the variable gcd.
     */
    public static int getGcd(int a, int b) {
        int gcd = 1;
        if (a > b) {
            for (int i = b; i >= 1; i--) {
                if (a%i == 0 && b%i == 0) {
                    return i;
                }
            }
        } else {
            for (int j = a; j >= 1; j--) {
                if (a%j == 0 && b%j == 0) {
                    return j;
                }
            }
        }
        return gcd;
    }

    /**
     * Count least common multiple.
     *
     * @param a the first specified number.
     * @param b the second specified number.
     * @return the received value of the variable lcm.
     */
    public static int getHcf(int a, int b) {
        int lcm = a * b / getGcd(a, b);
        return lcm;
    }
}
