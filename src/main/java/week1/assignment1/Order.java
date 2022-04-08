package week1.assignment1;

public class Order {
    public static void printOrder(Menu item) {
        String message = String.join(" ", "Porsi",
                item.getName(), "yang dipesan: ");
        System.out.print(message);
    };
}
