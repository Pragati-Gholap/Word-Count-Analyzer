import java.util.Scanner;
public class WordCountAnalyzer {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        int wordCount = countWords(text);
        int characterCount = countCharacters(text);
        double averageWordLength = calculateAverageWordLength(text, wordCount);

        System.out.println("Word count: " + wordCount);
        System.out.println("Character count: " + characterCount);
        System.out.println("Average word length: " + averageWordLength);
        
        scanner.close();
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static int countCharacters(String text) {
        return text.length();
    }

    public static double calculateAverageWordLength(String text, int wordCount) {
        int characterCount = countCharacters(text);
        return (double) characterCount / wordCount;
    }
}


