package org.technology;

public class SmartPhone extends Computer{
    private String os;

    public SmartPhone(String brand, String processor, int ram, String os) {
        super(brand, processor, ram);
        this.os = os;
    }

    public void makeCall() {
        System.out.println("Making a call on the smartphone.");
    }
}
