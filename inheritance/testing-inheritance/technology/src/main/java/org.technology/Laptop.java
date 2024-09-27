package org.technology;

public class Laptop extends Computer{
    private  int batteryLife;

    public Laptop(String brand, String processor, int ram, int batteryLife) {
        super(brand,
                processor,
                ram);
        this.batteryLife = batteryLife;
    }
     public void charge() {
         System.out.println("Charging the laptop.");
     }
}
