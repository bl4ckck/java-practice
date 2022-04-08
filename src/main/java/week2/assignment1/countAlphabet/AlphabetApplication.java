package week2.assignment1.countAlphabet;

import java.util.Scanner;

public class AlphabetApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Variable = ");
        Alphabet alphabet = new Alphabet(in.nextLine());
        alphabet.count("ALPHABET");
        alphabet.count("NUMBER");
    }
}
