package week3.assignment1.service;

import week3.assignment1.buffer.BufferFileImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class CentralTendencyService {
    private final String CSV_PATH = "data_sekolah.csv";
    private final String AVG_MEDIAN_PATH = "data_sekolah.csv";
    private final String MODUS_PATH = "data_sekolah.csv";

    public void generateAvgMedian() throws IOException {
        List<List<?>> arr = new BufferFileImpl(this.CSV_PATH).bufferedToList(true);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("\ndata idx: " + i);
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
        }
    }

    public void readCSV() throws IOException {
        new BufferFileImpl(this.CSV_PATH).readCSV();
    }

    public double getMedian() {
        return 0;
    }

    public double getAvg() throws FileNotFoundException {
        int[] data = new BufferFileImpl(this.CSV_PATH).bufferedToIntegerStream().toArray();
        for (int datum : data) {
            System.out.println(datum);
        }

        //        IntStream intStream = IntStream.of();
//        OptionalDouble res = intStream.average();
//
//        if (res.isPresent()) {
//            return res.getAsDouble();
//        }
        return 0;
    }
}
