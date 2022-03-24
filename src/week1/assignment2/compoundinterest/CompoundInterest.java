package week1.assignment2.compoundinterest;

import java.text.NumberFormat;
import java.util.Locale;

public class CompoundInterest {
    private int compound;
    private final int time;
    private final double principal, rate;
    private String compoundText;

    public CompoundInterest(CompoundTime compoundTime, double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate / 100;
        this.time = time;
        setCompound(compoundTime);
    }

    private void setCompound(CompoundTime compoundTime) {
        switch (compoundTime) {
            case MONTHLY:
                this.compound = 12;
                this.compoundText = "bulan";
                break;
            case ANNUALLY:
                this.compound = 1;
                this.compoundText = "tahun";
                break;
        }
    }

    public double calcCompoundInterest() {
        // A = P(1 + r/n)^nt
        double rn = 1 + (this.rate / this.compound);
        double nt = this.compound * this.time;
        return this.principal * Math.pow(rn, nt);
    }

    public String toRupiah(double number) {
        NumberFormat rp = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        return rp.format(number);
    }

    public void resultMessage() {
        String message = String.join(" ", "Dana awal",
                this.toRupiah(this.principal), "juta dengan suku bunga " + this.rate + "% per",
                this.compoundText + ". Uang yang diterima setelah " + this.time,
                "tahun adalah", this.toRupiah(this.calcCompoundInterest())
        );

        System.out.println(message + "\n");
    }
}