package week2.assignment3.number1.implementation;

import week2.assignment3.number1.Hewan;

import static week2.assignment3.number1.Food.DAUN;

public class Centipede extends Hewan {
    public Centipede() {
        super(100, DAUN);
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
