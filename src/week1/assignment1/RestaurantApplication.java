package week1.assignment1;

import week1.assignment1.config.MenuConfig;

import java.util.Scanner;

public class RestaurantApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu[] menuList = MenuConfig.selectedMenu();
        Checkout checkout = new Checkout();
        // Loop selected menu
        for(Menu menu : menuList) {
            // Insert order with quantity
            Order.printOrder(menu);
            int quantity = in.nextInt();
            // Set cart item into checkout
            checkout.setCart(new Cart(menu, quantity));
            // Calculation total price
            checkout.calcTotal();
        }
        // Result
        checkout.printResult();
    }
}
