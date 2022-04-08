package week1.twodimensional.implementations;

import week1.twodimensional.TwoDimensional;

public class Persegi extends TwoDimensional {
    private double p;

    public Persegi(String type, double p) {
        super(type);
        this.p = p;
    }

    @Override
    public double getResultLuas() {
        return Math.pow(this.p, 2);
    }

    @Override
    public double getResultKeliling() {
        return 4 * this.p;
    }
}
