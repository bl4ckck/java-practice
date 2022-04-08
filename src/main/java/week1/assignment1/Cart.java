package week1.assignment1;

public class Cart {
    private final Menu menu;
    private final int quantity;

    public Cart(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return this.menu.getPrice() * this.quantity;
    }
}
