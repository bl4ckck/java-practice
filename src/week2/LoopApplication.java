package week2;

public class LoopApplication {
    public static void main(String[] args) {
        rightSidedHalfTriangle();
        triangle();
        basicHalfTriangleReverse();
        basicHalfTriangle();
    }

    private static void rightSidedHalfTriangle() {
        System.out.println("\nRight Sided Half Triangle\n============");
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - (i + 1); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void triangle() {
        System.out.println("\nTriangle\n============");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - (i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void basicHalfTriangleReverse() {
        System.out.println("\nBasic Half Triangle Reverse Pattern\n============");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    private static void basicHalfTriangle() {
        System.out.println("\nBasic Half Triangle Pattern\n============");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
