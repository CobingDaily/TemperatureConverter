package temperature.units;

import temperature.Temperature;

public class Celsius extends Temperature {
    public Celsius(double value) {
        super(value);
    }

    @Override
    public double toFahrenheit() {
        return (getValue() * 9/5) + 32;
    }

    @Override
    public double toCelsius() {
        return getValue();
    }

    @Override
    public double toKelvin() {
        return getValue() + 273.15;
    }

    @Override
    public double toRankine() {
        return getValue() * 9/5 + 491.67;
    }
}
