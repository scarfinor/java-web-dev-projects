package org.technology;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "i7",16,10);
        SmartPhone smartPhone = new SmartPhone("Apple","A14",4,"iOS");

        laptop.powerOn();
        laptop.charge();
        smartPhone.powerOn();
        smartPhone.makeCall();
        System.out.println(laptop.id);
        System.out.println(smartPhone.id);
        laptop.powerOff();
        smartPhone.powerOff();
    }
}