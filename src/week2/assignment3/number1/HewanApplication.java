package week2.assignment3.number1;

import week2.assignment3.number1.implementation.*;

public class HewanApplication {
    public static void main(String[] args) {
        Hewan[] hewan = new Hewan[6];
        hewan[0] = new Dog();
        hewan[1] = new Spider();
        hewan[2] = new Fly();
        hewan[3] = new Centipede();
        hewan[4] = new Snake();
        hewan[5] = new Chicken();

        for (Hewan value : hewan) {
            value.printResult();
        }
    }
}
