package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringToArrayList {
    public static void printWordsWithLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String sentence = "This is a sample sentence for conversion";

        // Split the string into words and convert to ArrayList
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        // Print the ArrayList to verify
        System.out.println("Words in the list:");
        for (String word : wordsList) {
            System.out.println(word);
        }

        // Prompt user to enter the word length
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        // Call the method and print words with the given length
        printWordsWithLength(wordsList, numChars);

        // Close the scanner
        input.close();
    }
}
