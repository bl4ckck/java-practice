package week1.temperature;

public class CelciusCalculator extends ConverterTemperature {
    public CelciusCalculator(double from) {
        super(from);
    }

    private double toFarenheit() {
        return (super.getFrom() * 9/5) + 32;
    }

    @Override
    public double calculate() {
        return this.toFarenheit();
    }

}
