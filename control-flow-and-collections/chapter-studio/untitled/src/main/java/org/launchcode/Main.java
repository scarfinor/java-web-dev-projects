package org.launchcode;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String myString = input.nextLine();
        myString = myString.toUpperCase();
        input.close();
        //String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        //System.out.println(myString);
        //System.out.println(charactersInString);
        HashMap<Character, Integer> characterCount = new HashMap<>();

       // for ( Map.Entry<Character, Integer> character : charactersInString) {
           // if (characterCount.containsKey(character))
        //}

        for (char value : charactersInString) {
            if (characterCount.containsKey(value)) {
                characterCount.put(value, characterCount.get(value) + 1);
            }
            else if (Character.isLetter(value)) {
                characterCount.put(value, 1);
            }
        }
        System.out.println("Here is your hash map: " + characterCount);
    }
}