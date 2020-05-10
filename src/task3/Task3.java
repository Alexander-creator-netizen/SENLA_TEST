import java.util.Arrays;
import java.util.Scanner;

/**
 * The task counts the number of words in a sentence.
 * Output them in sorted form.
 * Make the first letter of each word uppercase.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = in.nextLine();
        System.out.println("Your sentence has " + countWords(sentence) + " words.");
    }

    /**
     * Counts the number of words in a sentence.
     * Output them in sorted form.
     * Make the first letter of each word uppercase.
     *
     * @param str input sentence.
     * @return number of lines in the sentence.
     */
    public static int countWords(String str) {
        String words[] = str.split(" ");
        Arrays.sort(words);
        StringBuilder b = new StringBuilder(str);
        int i = 0;
        do {
            b.replace(i, i + 1, b.substring(i, i + 1).toUpperCase());
            i =  b.indexOf(" ", i) + 1;
        } while (i > 0 && i < b.length());

        System.out.println(b.toString());
        int count = words.length;
        for (int j = 0; j < words.length; j++) {
        } return count;
    }
}




