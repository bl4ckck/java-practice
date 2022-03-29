package week1.assignment4;

import java.lang.reflect.Field;
import java.util.Scanner;

public class QuadraticApplication {
    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic();
        quadratic.dialogMessage("a");
        quadratic.dialogMessage("b");
        quadratic.dialogMessage("c");

        quadratic.result();
    }
}

class Quadratic {
    private int a, b, c;
    private final Scanner in = new Scanner(System.in);

    public String equation() {
        return String.join(" ", this.a+"x\u00B2", "+", this.b+"x", "+ "+ this.c, "= 0");
    }

    public double formula(double dis, String op) {
        double b4ac = Math.sqrt(dis < 0 ? dis * -1 : dis);
        double a2 = 2 * this.a;
        return op.equals("SUM") ? (-(this.b) + b4ac) / a2 : (-(this.b) - b4ac) / a2;
    }

    private void assignValue(String props, int number) throws IllegalAccessException, NoSuchFieldException {
        Field field = this.getClass().getDeclaredField(props);
        field.setAccessible(true);
        field.set(this, number);
    }

    public void dialogMessage(String props) {
        try {
            String message = String.join(" ", "Masukkan", props, "= ");
            System.out.print(message);
            this.assignValue(props, in.nextInt());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void result() {
        double discriminant = Math.pow(this.b, 2) - 4 * this.a * this.c;
        String imaginary = discriminant < 0 ? "i" : "";

        System.out.println(this.equation());
        if (discriminant == 0) {
            System.out.println("x = " + ((double) -(this.b) / 2 * this.a));
        } else {
            System.out.println("x1 = " + this.formula(discriminant, "SUM") + imaginary);
            System.out.println("x2 = " + this.formula(discriminant, "SUBTRACT") + imaginary);
        }
    }
}