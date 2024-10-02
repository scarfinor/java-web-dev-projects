package org.launchcode;

public class TemperatureException extends Exception{
    // Write code here!
    double absoluteZeroFahrenheit = -459.67;
    public TemperatureException(String message) {
        super(message);
    }
}
