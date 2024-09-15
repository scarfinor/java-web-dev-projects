package org.launchcode;

import java.util.ArrayList;

public class Sum {

   static ArrayList<Double> numbers = new ArrayList<>();

    public static double sum(ArrayList<Double> numArray) {
        Sum.numbers.add(1.0);
        Sum.numbers.add(2.0);
        Sum.numbers.add(3.0);
        Sum.numbers.add(4.0);
        Sum.numbers.add(5.0);
        Sum.numbers.add(6.0);
        Sum.numbers.add(7.0);
        Sum.numbers.add(8.0);
        Sum.numbers.add(9.0);
        Sum.numbers.add(10.0);

        double sumNum =  0;
        for (Double num : numArray){
            if(num % 2 == 0) {
                sumNum += num;
            }
        }
        return sumNum;
    }
    public static void main (String[] args){
        System.out.println(Sum.sum(numbers));

    }
}
