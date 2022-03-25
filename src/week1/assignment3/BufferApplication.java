package week1.assignment3;

import week1.assignment3.implementations.BufferFileImpl;

import java.io.*;
import java.util.stream.Stream;

public class BufferApplication {
    public static void main(String[] args) throws IOException {
        BufferFileImpl buffer = new BufferFileImpl("nilaiSemester5.txt");
        buffer.writeFile("nilaiSemester5Output.txt");
    }
}
