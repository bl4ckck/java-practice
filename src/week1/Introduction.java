package week1;

import java.util.Scanner;

public class Introduction {
    private static boolean decisionCheck(String decision) {
        return decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = in.nextLine();

        System.out.print("Enter age: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Enter address: ");
        String address = in.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = in.nextDouble();

        System.out.print("Are you married (y/n): ");
        String isMarried = in.next();

        if(!decisionCheck(isMarried)) {
            System.out.println("Format salah");
        } else {
            System.out.println("\n----- Biodata -----");
            System.out.println("Nama saya: " + name);
            System.out.println("usia saya: " + age);
            System.out.println("Alamat saya: " + address);
            System.out.println("IPK saya: " + gpa);
            System.out.println("Sudah menikah: " + isMarried.toLowerCase());
        }

    }
}
