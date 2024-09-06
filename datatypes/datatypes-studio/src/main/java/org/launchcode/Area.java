package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    double radius;
    Scanner input = new Scanner(System.in);
    do {
        System.out.println("Enter the radius of a circle: ");
        radius = input.nextDouble();
        if (radius <= 0) {
            System.out.println("Your radius must be a positive number!");
        }
    } while(radius <= 0);
    double area = Circle.getArea(radius);

    System.out.println("The area of your special circle is: " + area);
    }
}