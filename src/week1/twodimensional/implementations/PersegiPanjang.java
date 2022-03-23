package week1.twodimensional.implementations;

import week1.twodimensional.TwoDimensional;

public class PersegiPanjang extends TwoDimensional {
    private final int p;
    private final int l;

    public PersegiPanjang(String type, int p, int l) {
        super(type);
        this.p = p;
        this.l = l;
    }

    @Override
    public double getResultLuas() {
        return Math.multiplyExact(this.p, this.l);
    }

    @Override
    public double getResultKeliling() {
        int multiplyP = Math.multiplyExact(2, this.p);
        int multiplyL = Math.multiplyExact(2, this.l);
        return Math.addExact(multiplyP, multiplyL);
    }
}
