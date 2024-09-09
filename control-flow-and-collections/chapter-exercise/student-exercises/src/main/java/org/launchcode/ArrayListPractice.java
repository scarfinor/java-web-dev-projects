package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {

    // Method to print words with exactly 5 letters
    public static void printWordsWithLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of words
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("fig");
        words.add("grape");
        words.add("kiwi");
        words.add("lemon");
        words.add("mango");
        words.add("nectar");

        // Prompt user to enter the word length
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        // Call the method and print words with the given length
        printWordsWithLength(words, numChars);

        // Close the scanner
        input.close();
    }
}