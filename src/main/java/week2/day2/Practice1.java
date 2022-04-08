package week2.day2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nomor : ");
        int num = in.nextInt();
        int res = 0, ganjil = 0, genep = 0;

        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();

        for (int i = 0; i < digits.length; i++) {
            if(digits[i] % 2 == 0) genep += digits[i];
            ganjil += digits[i];
        }

        System.out.println("Ganjil: " + genep);
        System.out.println("Genep: " + ganjil);


//        String s1 = in.nextLine();
//
//        System.out.print("Enter string 2: ");
//        String s2 = in.nextLine();
//
//        System.out.println(s1.concat(s2));
//        System.out.println(s2.concat(s1));
    }
}
