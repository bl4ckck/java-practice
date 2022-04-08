package week3.exceptionpractice;

import week3.assignment1.GradeReportApplication;

import java.io.*;

public class ExceptionApplication {
    public static void main(String[] args) {
//        callWriter();
    }

    public static void callWriter() throws IOException {
        writer("we").println("");
//        if (writer(""))
        throw new IOException("");
    }

    public static PrintWriter writer(String path) throws IOException {
        File file = new File("src/week3/assignment1/output/");
        FileWriter fileWriter = new FileWriter(file.getAbsolutePath() + "/asdds");
        System.out.println("File saved in:");
        System.out.println(file.getAbsolutePath());
        return new PrintWriter(fileWriter);
    }
}
