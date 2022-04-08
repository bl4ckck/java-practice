package week1;

import java.util.*;
import java.util.stream.DoubleStream;

public class Mean {
    static void calcMean(List<Double> numbers) {
        double[] arr = numbers.stream().mapToDouble(i -> i).toArray();
        DoubleStream doubleStream = DoubleStream.of(arr);
        OptionalDouble res = doubleStream.average();

        if (res.isPresent()) {
            System.out.println("Mean: " + res.getAsDouble());
        } else {
            System.out.println("No result");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        List<Double> numbers = new ArrayList<>();
        while (true) {
            System.out.print("Score test #" + (i+1) + ": ");
            double num = in.nextDouble();
            numbers.add(num);
            in.nextLine();

            System.out.print("Continue? (Enter/n) ");
            if(in.nextLine().equalsIgnoreCase("n")) break;
            i++;
        }

        calcMean(numbers);
    }
}
