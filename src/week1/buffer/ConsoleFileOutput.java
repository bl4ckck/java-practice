package week1.buffer;

import java.io.*;
import java.util.Scanner;

public class ConsoleFileOutput {
    private static String nama, alamat, lulusKuliah;
    private static int umur;
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        dialogMessage();
//        writeFile();
        readFile();
    }

    public static void writeFile() throws IOException {
        String path = "/home/alvin/development/main_bootcamp/practice/src/week1/buffer/";
        PrintWriter writer = new PrintWriter(new FileWriter(path.concat("biodata.txt")));

        writer.println("Nama: " + nama);
        writer.println("Umur: " + umur);
        writer.println("Alamat: " + alamat);
        writer.println("Lulus Kuliah (y/n): " + lulusKuliah);

        writer.close();
    }

    public static void readFile() throws IOException {
        File file = new File("/home/alvin/development/main_bootcamp/practice/src/week1/buffer/biodata.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        System.out.println("\nBiodata\n============");
        reader.lines().forEach((d) -> {
            System.out.println(d.toString());
        });

        reader.close();
    }

    public static void dialogMessage() {
        System.out.print("Nama: ");
        nama = in.nextLine();

        System.out.print("Umur: ");
        umur = in.nextInt();
        in.nextLine();

        System.out.print("Alamat: ");
        alamat = in.nextLine();

        System.out.print("Lulus kuliah (y/n): ");
        lulusKuliah = in.nextLine();
    }
}
