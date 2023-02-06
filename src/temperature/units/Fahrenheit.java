package temperature.units;

import temperature.Temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(double value) {
        super(value);
    }

    @Override
    public double toFahrenheit() {
        return getValue();
    }

    @Override
    public double toCelsius() {
        return (getValue() - 32) * 5/9;
    }

    @Override
    public double toKelvin() {
        return (getValue() - 32) * 5/9 + 273.15;
    }

    @Override
    public double toRankine() {
        return getValue() + 459.67;
    }
}
