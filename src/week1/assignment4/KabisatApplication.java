package week1.assignment4;

import java.util.Scanner;

public class KabisatApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        isKabisat(in.nextInt());
    }

    private static void isKabisat(int tahun) {
        String res = tahun + " bukan tahun kabisat";
        if (tahun % 4 == 0 && tahun % 100 != 0
                || tahun % 100 == 0 && tahun % 400 == 0) {
            res = tahun + " adalah tahun kabisat";
        }
        System.out.println(res);
    }
}
