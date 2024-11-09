import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.print("Enter a sentence: ");
        //String sentence = stdin.nextLine();
        String sentence = "This is a great big blue ship with blue sails but without bluetails";
        //String targetWord = "blue";

        System.out.print("Enter a word to search: ");
        String targetWord = stdin.next();

        int count = 0;

        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i].equals(targetWord)) {
                count += 1;
            }

        }
        System.out.println("The word has been found: " + count);


    }
}