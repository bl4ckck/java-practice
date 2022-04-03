package week3.assignment1.buffer;

import week3.assignment1.GradeReportApplication;

import java.io.*;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;

abstract public class BufferFile {
    private boolean isAbsolutePath;
    private final BufferedReader buffer;

    public BufferFile(String path) throws FileNotFoundException {
        this.buffer = this.setBuffer(path);
    }

    public BufferFile(String path, boolean isAbsolutePath) throws FileNotFoundException {
        this.buffer = this.setBuffer(path);
        this.isAbsolutePath = isAbsolutePath;
    }

    public abstract IntStream bufferedToIntegerStream() throws FileNotFoundException;

    public BufferedReader setBuffer(String path) {
        BufferedReader buffer = null;
        try {
            InputStream relativePath = GradeReportApplication.class.getResourceAsStream(path);
            assert relativePath != null;
            InputStreamReader file = new InputStreamReader(relativePath);
            buffer = this.isAbsolutePath ? this.setBufferAbsolutePath(path) : new BufferedReader(file);
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("File tidak ditemukan!");
        }
        return buffer;
    }

    private BufferedReader setBufferAbsolutePath(String path) throws FileNotFoundException {
        File file = new File(path);
        return new BufferedReader(new FileReader(file));
    }

    public BufferedReader getBuffer() {
        return this.buffer;
    }

    public boolean isAbsolutePath() {
        return isAbsolutePath;
    }
}

