package week1.assignment4;

import java.util.Scanner;

public class ConditionalApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Object[][] numbers = {{2, "N1"}, {1, "N2"}, {2, "N3"}};
//        boolean awe = numbers[0][0] == numbers[2][0];
//        System.out.println("n1=n2: " + awe);
        System.out.print("no1 : ");
        double n1 = in.nextDouble();

        System.out.print("no2 : ");
        double n2 = in.nextDouble();
        // Is two number are same
        isSame(n1, n2);
        // Is N1 odd / even
        isOddEven(n1, n2);

        // Largest numbers
        System.out.print("\nno3 : ");
        double n3 = in.nextDouble();
        largestNumber(n1, n2, n3);

        // Get Hari
        System.out.print("\nInput hari (1-7): ");
        int numHari = in.nextInt();
        getHari(numHari);

        // Vokal / Konsonan
        System.out.print("\nInput satu huruf: ");
        char word = in.next().charAt(0);
        isVocal(word);

        in.close();
    }

    private static void isVocal(char word) {
        String result = "Konsonan";
        word = Character.toLowerCase(word);
        if (word == 'a' || word == 'i' || word == 'u'
                || word == 'e' || word == 'o') {
            result = "Vokal";
        }
        System.out.println(result);
    }

    private static void getHari(int numHari) {
        String hari = "";
//        Locale locale = new Locale("id", "ID");
//        String day = DayOfWeek.of(numHari).getDisplayName(TextStyle.FULL, locale);

        switch (numHari) {
            case 1: hari = "Senin"; break;
            case 2: hari = "Selasa"; break;
            case 3: hari = "Rabu"; break;
            case 4: hari = "Kamis"; break;
            case 5: hari = "Jumat"; break;
            case 6: hari = "Sabtu"; break;
            case 7: hari = "Minggu"; break;
            default: hari = "Silakan isi 1-7";
        }
        System.out.println("\n"+hari);
    }

    // 2, 2, 2 = N1, N2, N3 are equals
    // 2, 1, 1 = N1 is largest
    // 2, 2, 1 = N1, N2 are equals
    // 2, 1, 2 = N1, N3 are equals
    // 1, 2, 2 = N2, N3 are equals
    private static void largestNumber(double n1, double n2, double n3) {
        String msg = "";
        if (n3 > n2 && n3 > n1) msg = "N3 is largest";
        else if (n2 > n1 && n2 > n3) msg = "N2 is largest";
        else if (n1 > n2 && n1 > n3) msg = "N1 is largest";
        else {
            if (Double.compare(n1, n2) == 0 && Double.compare(n3, n2) == 0) msg = "N1, N2, N3 are equals";
            else msg = isSame(new Object[][]{{n1, "N1"}, {n2, "N2"}, {n3, "N3"}}, 0);
        }
        System.out.println(msg);
    }

    private static String isSame(Object[][] num, int i) {
        int case1 = (i == 2) ? 0 : i + 1, case2 = (i == 2) ? 1 : 2;
        if (toDouble(num[i][0]) == toDouble(num[case1][0])) return res(num[i][1], num[case1][1]);
        else if (toDouble(num[i][0]) == toDouble(num[case2][0])) return res(num[i][1], num[case2][1]);
        return isSame(num, ++i);
    }
    private static double toDouble(Object num) { return (Double) num; }
    private static String res(Object w1, Object w2) { return String.join(" ", w1+", "+ w2, "are equals"); }

    private static void isSame(double n1, double n2) {
        System.out.println("\nIs Same?\n========");
        if (n1 == n2) {
            System.out.println("Sama cuy");
        } else {
            System.out.println("Ga sama");
        }
    }

    private static void isOddEven(double n1, double n2) {
        System.out.println("\nN1 Is Odd / Even?\n========");
        if (n1 % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
