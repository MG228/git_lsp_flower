package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounting {
    public void countWords(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Print the line first
                System.out.println(line);

                // counting and making lower case
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // no numbers!! 
                    if (!word.matches(".*\\d.*")) {
                        String lowercaseWord = word.toLowerCase();
                        wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // output of word count
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        WordCounting wordCounter = new WordCounting();
        wordCounter.countWords("src/org/howard/edu/lsp/assignment2/words.txt");
    }
}

