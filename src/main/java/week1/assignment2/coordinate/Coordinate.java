package week1.assignment2.coordinate;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.function.Function;

public class Coordinate {
    private int x1, y1, x2, y2;

    private void assignValue(String props, int number) throws IllegalAccessException, NoSuchFieldException {
        Field field = this.getClass().getDeclaredField(props);
        field.setAccessible(true);
        field.set(this, number);
    }

    public void dialogMessage(String props, Scanner in) {
        try {
            String message = String.join(" ", "Enter", props, ": ");
            System.out.print(message);
            this.assignValue(props, in.nextInt());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public double calcCoordinate() {
        // √(x2-x1)²+(y2-y1)²
        double x2x1 = Math.pow(this.x2 - this.x1, 2);
        double y2y1 = Math.pow(this.y2 - this.y1, 2);
        return Math.sqrt(x2x1 + y2y1);
    }

    public void resultMessage() {
        // Type for Lambda -> Function, Predicate, Consumer
        Function<int[], String> message = (num) ->
                String.join("", "(" + num[0], ", "+num[1], ")");
        String xy1 = message.apply(new int[]{this.x1, this.y1});
        String xy2 = message.apply(new int[]{this.x2, this.y2});
        System.out.println(String.join(" ",
                "Jarak antara", xy1, "dan", xy2, "= " + this.calcCoordinate()));
    }
}
