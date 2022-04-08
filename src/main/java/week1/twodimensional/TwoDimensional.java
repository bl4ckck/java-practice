package week1.twodimensional;

import java.text.DecimalFormat;

public abstract class TwoDimensional {
    private final String type;

    public TwoDimensional(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public double formatResult(double result) {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(result);
        return Double.parseDouble(formatted);
    }

    public void resultMessage() {
        System.out.println("\nLuas dan keliling " + this.type);
        System.out.println("Luas = " + this.getResultLuas());
        System.out.println("Keliling = " + this.getResultKeliling());
    }

    public abstract double getResultLuas();

    public abstract double getResultKeliling();
}
