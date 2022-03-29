package week2.assignment1;

import java.util.Scanner;

public class ReverseStrApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        reverse(in.nextLine());
    }

    private static void reverse(String words) {
        char[] arr = words.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]);
        }
        System.out.println("Kalimat terbalik = " + res);
    }
}
