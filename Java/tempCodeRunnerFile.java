import java.util.*;

public class WordOccurrences {
    public static void main(String[] args) {
        // Sample text
        String text = "This is a sample text for word occurrences program. This program counts the occurrences of each word.";

        // Remove punctuation marks and convert to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the text into words
        String[] words = text.split(" ");

        // Create a TreeMap to store word occurrences in alphabetical order
        TreeMap<String, Integer> wordOccurrencesMap = new TreeMap<>();

        // Count word occurrences
        for (String word : words) {
            wordOccurrencesMap.put(word, wordOccurrencesMap.getOrDefault(word, 0) + 1);
        }

        // Display words and their occurrences in alphabetical order
        System.out.println("Words and their occurrences (in alphabetical order):");
        for (Map.Entry<String, Integer> entry : wordOccurrencesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
