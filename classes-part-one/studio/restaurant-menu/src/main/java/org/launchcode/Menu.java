package org.launchcode;

import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;

import org.launchcode.MenuItem;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        items = new ArrayList<>();
        lastUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        items.add(item);
        lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = new Date();
    }

    public void displayMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void printMenu() {
        System.out.println("Menu (last updated: " + lastUpdated + ")");
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void printMenuItem(String value) {
        System.out.println("Menu Item: " + items);

        for (MenuItem item : items) {
            if(value.contains((CharSequence) item)) {
            System.out.println(value);
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu menu)) return false;
        return Objects.equals(items, menu.items) && Objects.equals(lastUpdated, menu.lastUpdated);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}