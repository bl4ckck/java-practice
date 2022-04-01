package week2.assignment3.number1;

public abstract class Hewan {
    protected String name;
    final protected int numberOfLegs;
    final protected Food favoriteFood;

    public Hewan(int numberOfLegs, Food favoriteFood) {
        this.numberOfLegs = numberOfLegs;
        this.favoriteFood = favoriteFood;
    }

    protected void setName(Class<? extends Hewan> name) {
        this.name = name.getSimpleName();
    }

    public void printResult() {
        System.out.println("\n" + this.name + "\n============");
        System.out.println("Jumlah Kaki: " + this.getNumberOfLegs());
        System.out.println("Makanan Favorit: " + this.getFavoriteFood());
    }

    public abstract int getNumberOfLegs();
    public abstract String getFavoriteFood();
}
