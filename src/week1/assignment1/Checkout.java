package week1.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private Cart cart;
    private final List<Cart> cartItems = new ArrayList<>();
    private double total = 0;

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cartItem) {
        this.cart = cartItem;
        this.cartItems.add(cartItem);
    }

    public List<Cart> getCartItems() {
        return this.cartItems;
    }

    public void calcTotal() {
//        double total = 0;
//        for (Cart item : this.cartItems) {
//        }
//        return total;
        this.total = Double.sum(this.total, this.cart.getSubTotal());
    }

    public void printResult() {
        System.out.println("\nTotal harga yang harus dibayar: " + this.total);
    }
}
