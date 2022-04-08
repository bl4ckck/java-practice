package week2.assignment2;

public class StarApplication {
    public static void main(String[] args) {
        System.out.println("\nTriangle\n============");
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - (i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
