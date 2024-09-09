package org.launchcode;

import  java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        // words
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        // sentences
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
