package org.technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
@Test
    public void testPowerOn() {
    Computer computer = new Computer("Brand", "Processor", 8);
    assertDoesNotThrow(() -> computer.powerOn());
    }

    @Test
    public void testPowerOff() {
    Computer computer = new Computer("Brand", "Processor",8);
    assertDoesNotThrow(() -> computer.powerOff());
    }

    @Test
    public void testGetId() {
    Computer computer = new Computer("Brand","Processor",8);
    assertNotEquals(0, computer.getId());
    }
}
