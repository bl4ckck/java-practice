package week1.temperature;

public abstract class ConverterTemperature {
    private final double from;

    public ConverterTemperature(double from) {
        this.from = from;
    }

    public abstract double calculate();

    public double getFrom() {
        return from;
    }
}
