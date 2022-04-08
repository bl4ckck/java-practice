package week1;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Gradient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("X1: ");
        double x1 = in.nextDouble();

        System.out.print("X2: ");
        double x2 = in.nextDouble();

        System.out.print("Y1: ");
        double y1 = in.nextDouble();

        System.out.print("Y2: ");
        double y2 = in.nextDouble();

        // Result
        double gradient = (y2-y1) / (x2-x1);
        System.out.println("Gradient: " + gradient);
    }
}
