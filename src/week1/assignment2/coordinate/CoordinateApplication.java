package week1.assignment2.coordinate;

import java.util.Scanner;

public class CoordinateApplication {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Scanner in = new Scanner(System.in);
        Coordinate coordinate = new Coordinate();
        // Input number
        coordinate.dialogMessage("x1", in);
        coordinate.dialogMessage("y1", in);
        coordinate.dialogMessage("x2", in);
        coordinate.dialogMessage("y2", in);
        // Result
        coordinate.resultMessage();
    }
}
