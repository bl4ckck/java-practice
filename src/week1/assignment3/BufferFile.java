package week1.assignment3;

import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

abstract public class BufferFile {
    private final BufferedReader buffer;

    public BufferFile(String path) {
        this.buffer = this.setBuffer(path);
    }

    public abstract IntStream bufferedToIntegerStream() throws FileNotFoundException;

    public BufferedReader setBuffer(String path) {
        InputStream relativePath = BufferFile.class.getResourceAsStream(path);
        assert relativePath != null;
        InputStreamReader file = new InputStreamReader(relativePath);
        return new BufferedReader(file);
    }

    public BufferedReader getBuffer() {
        return this.buffer;
    }
}
