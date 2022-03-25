package week1.assignment3.implementations;

import week1.assignment3.BufferFile;

import java.io.*;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BufferFileImpl extends BufferFile {
    private final int[] data;

    public BufferFileImpl(String path) {
        super(path);
        this.data = this.bufferedToIntegerStream().toArray();
    }

    public double calcAvg() {
        IntStream intStream = IntStream.of(this.data);
        OptionalDouble res = intStream.average();

        if (res.isPresent()) {
            return res.getAsDouble();
        }
        return 0;
    }

    public void writeFile(String fileName) throws IOException {
        File file = new File("src/week1/assignment3/");
        PrintWriter writer = new PrintWriter(new FileWriter(file.getAbsolutePath() + "/" + fileName));
        System.out.println(file.getAbsolutePath());
        for (int num : data) {
            writer.println(num);
        }
        writer.println("--");
        writer.println("rata-rata = " + this.calcAvg());
        System.out.println("File saved!");
        writer.close();
    }

    @Override
    public IntStream bufferedToIntegerStream() {
        return this.getBuffer()
                .lines()
                .mapToInt(Integer::parseInt);
    }
}
