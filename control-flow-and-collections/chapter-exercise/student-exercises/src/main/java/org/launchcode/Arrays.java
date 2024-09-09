package org.launchcode;

public class Arrays {
    public static void main(String[] args) {
        int[] integerArray = {1,1,2,3,5,8};

        for (int i : integerArray) {
            if (i == 1 || i == 3 || i == 5) {
            System.out.println(i);
            }
        }
    }
}
