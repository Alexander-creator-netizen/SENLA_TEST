import java.util.Scanner;

/**
 * The task searches for a word in a sentence.
 */
public class Task4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            System.out.println("Input text: ");
    String str = sc.nextLine().toLowerCase();
    System.out.println("Search word: ");
    String word = sc.nextLine().toLowerCase();
    int index = 0;
    int result = 0;
    while (index != -1) {
        index = str.indexOf(word, index);
        if(index != -1) {
            result++;
                    index += word.length();
        }
    }
        System.out.println(result);
    }
}

