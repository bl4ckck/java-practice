package week3.assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIApplication {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("\nMasukkan berat badan (kg): ");
                bmi.setWeight(in.nextDouble());

                System.out.print("Masukkan tinggi badan (cm): ");
                bmi.setHeight(in.nextDouble());
                bmi.result();
            } catch (InputMismatchException e) {
                System.out.println("Masukkan input yang sesuai");
                in.next();
            }
        }
    }
}

class BMI {
    private double weight;
    private double height;

    public double getBMI() {
        return this.weight / Math.pow((this.height), 2);
    }

    public void result() {
        String msg;
        if (getBMI() > 30) {
            msg = "Anda obesitas";
        } else if (getBMI() > 25) {
            msg = "Anda kelebihan berat badan";
        } else if (getBMI() > 18.5) {
            msg = "Anda sehat";
        } else {
            msg = "Anda kekurangan berat badan";
        }
        System.out.println("BMI: " + getBMI());
        System.out.println(msg);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height / 100;
    }
}
