package week3.assignment1.buffer;

import week3.assignment1.helper.StreamUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BufferFileImpl extends BufferFile {
//    private final int[] data;
//    private final List<List<String>> records = new ArrayList<>();

    public BufferFileImpl(String path) throws FileNotFoundException {
        super(path);
//        this.data = this.bufferedToIntegerStream().toArray();
    }

    public BufferFileImpl(String path, boolean isAbsolutePath) throws FileNotFoundException {
        super(path, isAbsolutePath);
//        this.data = this.bufferedToIntegerStream().toArray();
    }

    public List<List<?>> bufferedToList(boolean removeString) throws IOException {
        String line;
        List<List<?>> records = new ArrayList<>();

        if (this.getBuffer() != null) {
            while ((line = this.getBuffer().readLine()) != null) {
                List<String> values = new ArrayList<>(Arrays.asList(line.split(";")));
                if (removeString) {
                    values.remove(0);
                    List<Integer> listNumber = StreamUtil.toListInteger(values);
                    records.add(listNumber);
                } else records.add(values);
            }
        }
        this.getBuffer().close();
        return records;
    }

    public void readCSV() throws IOException {
        this.bufferedToList(false).forEach(System.out::println);
    }

    @Override
    public IntStream bufferedToIntegerStream() throws FileNotFoundException {
        return this.getBuffer()
                .lines()
                .mapToInt(Integer::parseInt);
    }
}
