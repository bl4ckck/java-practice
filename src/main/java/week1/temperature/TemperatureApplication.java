package week1.temperature;

import week1.temperature.CelciusCalculator;

public class TemperatureApplication {
    public static void main(String[] args) {
        CelciusCalculator celcius = new CelciusCalculator(37.0);
        System.out.println("C -> F: "+celcius.calculate());
    }
}
