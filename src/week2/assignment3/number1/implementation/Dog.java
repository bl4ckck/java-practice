package week2.assignment3.number1.implementation;

import week2.assignment3.number1.Hewan;

import static week2.assignment3.number1.Food.DAGING;

public class Dog extends Hewan {
    public Dog() {
        super(4, DAGING);
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
