package temperature;


public abstract class Temperature {
    private double value;

    public Temperature(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void printAllUnits() {
        String output = "°F: " + toFahrenheit() + "\n" +
                        "°C: " + toCelsius() + "\n" +
                        "°K: " + toKelvin() + "\n" +
                        "°R: " + toRankine();

        System.out.println(output);
    }

    public void printUnit(String unit) {
        switch (unit.toUpperCase()) {
            case "F":
                System.out.println(toFahrenheit());
                break;
            case "C":
                System.out.println(toCelsius());
                break;
            case "K":
                System.out.println(toKelvin());
                break;
            case "R":
                System.out.println(toRankine());
                break;
            default:
                System.out.println("Invalid unit");
                break;
        }
    }

    public abstract double toFahrenheit();
    public abstract double toCelsius();
    public abstract double toKelvin();
    public abstract double toRankine();
}
