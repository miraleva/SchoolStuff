import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a sentence and it will be reversed: ");
        String sentence = input.nextLine();

        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("You didn't type anything, please type something valid!");
            return;
        }

        String[] words = sentence.split(" ");
        StringBuilder revSent = new StringBuilder();

        for (String word : words) {
            StringBuilder revWord = new StringBuilder(word);
            revSent.append(revWord.reverse()).append(" ");
        }

        System.out.println("Reversed Sentence:" + revSent.toString().trim());
    }
}
