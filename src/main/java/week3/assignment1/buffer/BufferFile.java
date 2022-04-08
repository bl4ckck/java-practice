package week3.assignment1.buffer;

import week3.assignment1.GradeReportApplication;

import java.io.*;
import java.util.stream.IntStream;

abstract public class BufferFile {
    private boolean isAbsolutePath;
    private BufferedReader buffer;
    protected String path;

    public BufferFile(String path)  {
        this.buffer = this.setBuffer(path);
        this.path = path;
    }

    public BufferFile(String path, boolean isAbsolutePath) {
        this.buffer = this.setBuffer(path);
        this.isAbsolutePath = isAbsolutePath;
        this.path = path;
    }

    public BufferFile() {}

    public abstract IntStream bufferedToIntegerStream() throws FileNotFoundException;

    public BufferedReader setBuffer(String path) {
        BufferedReader buffer = null;
        try {
            InputStream relativePath = GradeReportApplication.class.getResourceAsStream("/" + path);
            assert relativePath != null;
            InputStreamReader file = new InputStreamReader(relativePath);
            buffer = this.isAbsolutePath ? this.setBufferAbsolutePath(path) : new BufferedReader(file);
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("File tidak ditemukan!");
        }
        return buffer;
    }

    public PrintWriter writer(String path) throws IOException {
        this.path = path;
        File file = new File("src/main/java/week3/assignment1/output/");
        FileWriter fileWriter = new FileWriter(file.getAbsolutePath() + "/" + this.path);
        System.out.println("File saved in:");
        System.out.println(file.getAbsolutePath());
        return new PrintWriter(fileWriter);
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

    public String getPath() {
        return path;
    }
}

