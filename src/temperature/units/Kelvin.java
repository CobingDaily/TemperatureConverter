package temperature.units;

import temperature.Temperature;

public class Kelvin extends Temperature {
    public Kelvin(double value) {
        super(value);
    }

    @Override
    public double toFahrenheit() {
        return (getValue() - 273.15) * 9/5 + 32;
    }

    @Override
    public double toCelsius() {
        return getValue() - 273.15;
    }

    @Override
    public double toKelvin() {
        return getValue();
    }

    @Override
    public double toRankine() {
        return getValue() * 9/5;
    }
}
