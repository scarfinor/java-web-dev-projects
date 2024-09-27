package org.technology;

public class Computer extends AbstractEntity {
    private String brand;
    private String processor;
    private int ram;

    public Computer(String brand, String processor, int ram) {
        super();
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    public void powerOn() {
        System.out.println(brand + " is powering on.");
    }

    public void powerOff() {
        System.out.println(brand + " is powering off.");
    }

}
