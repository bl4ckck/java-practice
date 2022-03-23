package week1.twodimensional.implementations;

import week1.twodimensional.TwoDimensional;

public class Lingkaran extends TwoDimensional {
    private final int r;
    private final double pi = Math.PI;

    public Lingkaran(String type, int r) {
        super(type);
        this.r = r;
    }

    @Override
    public double getResultLuas() {
        return this.formatResult(this.pi * Math.pow(r, 2));
    }

    @Override
    public double getResultKeliling() {
        return this.formatResult(2 * this.pi * this.r);
    }
}
