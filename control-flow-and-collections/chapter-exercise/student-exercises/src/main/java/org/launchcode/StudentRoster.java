package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        // Create a HashMap to store student ID and names
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        // Prompt user to enter student names and IDs
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                // Consume the newline character left by nextInt()
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        // Close the scanner
        input.close();

        // Print the class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        // Print the number of students in the roster
        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
