package org.technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SmartPhoneTest {
    @Test
    public void testMakeCall() {
        SmartPhone smartphone = new SmartPhone("Apple", "A14", 4, "iOS");
        assertDoesNotThrow(() -> smartphone.makeCall());
    }

    @Test
    void testGetId() {
        SmartPhone phone = new SmartPhone("Apple", "A14", 4, "iOS");
        assertNotEquals(0, phone.getId());
    }
}
