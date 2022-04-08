package week2.assignment3.number1.implementation;

import week2.assignment3.number1.Hewan;

import static week2.assignment3.number1.Food.KACANG;

public class Chicken extends Hewan {
    public Chicken() {
        super(2, KACANG);
        this.setName(this.getClass());
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public String getFavoriteFood() {
        return this.favoriteFood.toString();
    }
}
