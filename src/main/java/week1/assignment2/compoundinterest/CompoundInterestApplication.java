package week1.assignment2.compoundinterest;

import static week1.assignment2.compoundinterest.CompoundTime.*;

public class CompoundInterestApplication {
    public static void main(String[] args) {
        // Instances
        // Soal A
        CompoundInterest compoundInterestMonthly = new CompoundInterest(
                MONTHLY,10_000_000, 0.5, 4);
        // Soal B
        CompoundInterest compoundInterestAnnually = new CompoundInterest(
                ANNUALLY,15_000_000, 6, 5);
        // Result
        compoundInterestMonthly.resultMessage();
        compoundInterestAnnually.resultMessage();
    }
}
