package week1.twodimensional;

import week1.twodimensional.implementations.Lingkaran;
import week1.twodimensional.implementations.Persegi;
import week1.twodimensional.implementations.PersegiPanjang;

public class TwoDimensionalApplication {
    public static void main(String[] args) {
        // New instance
        PersegiPanjang persegiPanjang = new PersegiPanjang("Persegi Panjang", 2, 2);
        Persegi persegi = new Persegi("Persegi", 4);
        Lingkaran lingkaran = new Lingkaran("Lingkaran", 7);
        // Result
        persegiPanjang.resultMessage();
        persegi.resultMessage();
        lingkaran.resultMessage();
    }
}
