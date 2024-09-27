package org.technology;

public class AbstractEntity {
    private static int idCounter = 0;
    protected int id;

    public AbstractEntity() {
        this.id = generateId();
    }

    protected int generateId() {
        return ++idCounter;
    }

    public int getId() {
        return id;
    }
}
