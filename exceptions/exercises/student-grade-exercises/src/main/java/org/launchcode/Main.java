package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        try {
            System.out.println(Divide(10,2));
            System.out.println(Divide(10,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            try {
                int points = CheckFileExtension(entry.getValue());
                System.out.println(entry.getKey() + ": " + points + "points");
            } catch (Exception e) {
                System.out.println(entry.getKey() + ": " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        try {
            return  x/y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static int CheckFileExtension(String fileName) throws Exception
    {
        // Write code here!
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        }
        return 0;
    }
}