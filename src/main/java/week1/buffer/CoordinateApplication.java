package week1.buffer;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class CoordinateApplication {
    public static void readFile() throws IOException {
        File file = new File("/home/alvin/development/main_bootcamp/practice/src/week1/buffer/in.txt");
        // public BufferedReader(Reader in)
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Object[] toArray = reader.lines().toArray();
        Coordinate coordinate = new Coordinate();

//        reader.lines().forEach((d) -> {
//        });
        coordinate.dialogMessage("x1", toArray[0].toString());
        coordinate.dialogMessage("y1", toArray[1].toString());
        coordinate.dialogMessage("x2", toArray[2].toString());
        coordinate.dialogMessage("y2", toArray[3].toString());
        // Result
        coordinate.resultMessage();
        reader.close();
    }

    public static void writeFile() throws IOException {
        String path = "/home/alvin/development/main_bootcamp/practice/src/week1/buffer/";
        PrintWriter writer = new PrintWriter(new FileWriter(path.concat("nilaiSemester5Output.txt")));

        writer.println("Nama saya");
        writer.println("bl4ckck");
        writer.println(100);
        writer.println('A');
        writer.println(true);
        writer.println(false);

        writer.close();

    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException {
        writeFile();
    }
}
