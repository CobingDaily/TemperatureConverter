package temperature.units;

import temperature.Temperature;

public class Rankine extends Temperature {
    public Rankine(double value) {
        super(value);
    }

    @Override
    public double toFahrenheit() {
        return getValue() - 459.67;
    }

    @Override
    public double toCelsius() {
        return (getValue() - 491.67) * 5/9;
    }

    @Override
    public double toKelvin() {
        return getValue() * 5/9;
    }

    @Override
    public double toRankine() {
        return getValue();
    }
}
