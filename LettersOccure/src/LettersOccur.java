import java.util.Scanner;

public class LettersOccur { public static void main(String[] args) {
    int i, length, counter[] = new int[256];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the sentence: ");
    String sentence1= scanner.nextLine();

    String sentence2=sentence1.toLowerCase();

    String sentence3;
    sentence3 = sentence2.replaceAll(" ", "");
    length = sentence3.length();


    for (i = 0; i < length; i++) {
        counter[(int) sentence3.charAt(i)]++;
    }

    System.out.println(" OCCURRENCE OF LETTERS ");
    for (i = 0; i < 256; i++) {
        if (counter[i] != 0) {
            System.out.println((char) i + " - " + counter[i]);
        }
    }
}

}
