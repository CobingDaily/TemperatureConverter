package temperature;

import temperature.units.Celsius;
import temperature.units.Fahrenheit;
import temperature.units.Kelvin;
import temperature.units.Rankine;

public class TemperatureFactory {
    public static Temperature CreateTemperature(String unit, double value) throws IllegalAccessException {
        switch (unit.toUpperCase()) {
            case "F":
                return new Fahrenheit(value);
            case "C":
                return new Celsius(value);
            case "K":
                return new Kelvin(value);
            case "R":
                return new Rankine(value);
            default:
                throw new IllegalAccessException("Invalid unit");
        }

    }
}
