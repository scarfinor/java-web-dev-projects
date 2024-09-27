package org.technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LaptopTest {
    @Test
    public void testCharge() {
        Laptop laptop = new Laptop("Dell", "i7", 16, 10);
        assertDoesNotThrow(() -> laptop.charge());
    }

    @Test
    void testGetId() {
        Laptop laptop = new Laptop("Dell", "i7", 16,10);
        assertNotEquals(0, laptop.getId());
    }

}
