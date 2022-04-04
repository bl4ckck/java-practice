package week3.assignment1.service;

import week3.assignment1.buffer.BufferFileImpl;
import week3.assignment1.helper.Helper;
import week3.assignment1.helper.StreamUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CentralTendencyService {
    private final String CSV_PATH = "data_sekolah.csv";
    private final String AVG_MEDIAN_PATH = "data_sekolah_avg_median.txt";
    private final String MODUS_PATH = "data_sekolah_modus.txt";
    private final String ALL_PATH = "data_sekolah_all.txt";
    private final String INFO = "Right click -> Reload from Disk in `/output` to get the file";

    private final List<List<?>> repo =
            new BufferFileImpl(this.CSV_PATH).bufferedToList(true);
    List<Integer> destruct = StreamUtil.destructList(this.repo);

    public CentralTendencyService() throws IOException {}

    public void generateAll() throws IOException {
        this.generateAvgMedian();
        this.generateModus();
    }

    public void generateAvgMedian() throws IOException {
        PrintWriter writer = new BufferFileImpl().writer(this.AVG_MEDIAN_PATH);
        double median = this.getMedian();
        double mean = this.getAvg();
        int modus = this.getModusOne()[0];

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Modus: " + modus);

        writer.println("Berikut Hasil Pengolahan Nilai:");
        writer.println("Berikut hasil sebaran data nilai");
        writer.println("Mean: " + mean);
        writer.println("Median: " + median);
        writer.println("Modus: " + modus);
        System.out.println(this.INFO);
        writer.close();
    }

    public void generateModus() throws IOException {
        PrintWriter writer = new BufferFileImpl().writer(this.MODUS_PATH);
        List<List<String>> modus = this.getModus(true);
        String colNilai = "Nilai"+ Helper.symbol(10, " ");
        String colFreq = "| Frekuensi"+ Helper.symbol(10, " ");

        writer.println("Berikut Hasil Pengolahan Nilai:\n");
        writer.println(colNilai + colFreq);
        System.out.println(colNilai + colFreq);

        for (List<String> list : modus) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                int length = colNilai.length() - list.get(i).length();
                tmp.append(list.get(i))
                        .append(Helper.symbol(length, " "))
                        .append(i == 1 ? "" : "| ");
            }
            writer.println(tmp);
            System.out.println(tmp);
        }
        System.out.println(this.INFO);
        writer.close();
    }

    public void readCSV() throws IOException {
        new BufferFileImpl(this.CSV_PATH).readCSV();
    }

    public int[] getModusOne() {
        List<List<String>> modus = this.getModus(false);
        int[] result = new int[]{0,0};

        for (int i = 0; i < modus.size(); i++) {
            if (i+1 != modus.size()) {
                int val = Integer.parseInt(modus.get(i).get(1));
                int val2 = Integer.parseInt(modus.get(i + 1).get(1));

                if (val < val2) {
                    if (result[1] < val2) {
                        result[0] = Integer.parseInt(modus.get(i + 1).get(0));
                        result[1] = val2;
                    }
                }
            }
        }
        return result;
    }

    public List<List<String>> getModus(boolean isFormatted) {
        List<List<String>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>(this.destruct);

        int i = 0;
        for (Integer r : set) {
            int freq = Collections.frequency(this.destruct, r);
            List<String> item = new ArrayList<>();
            // Init index 0 item
            if (i == 0 && isFormatted) {
                result.add(new ArrayList<>(){
                    {
                        add("kurang dari 6");
                        add("0");
                    }
                    // { add("0"); }
                });
            }
            if (r < 6 && isFormatted) {
                int tmp = Integer.parseInt(result.get(0).get(1));
                item.add(result.get(0).get(0));
                item.add(""+ (freq + tmp));
                result.set(0, item);
            } else {
                item.add(""+r);
                item.add(""+freq);
                result.add(item);
            }
            i++;
        }
        return result;
    }

    public double getMedian() {
        double result;
        int n = this.destruct.size();
        Collections.sort(this.destruct);

        if (this.destruct.size() % 2 == 0) {
            result = this.destruct.get(n/2);
        } else {
            int pos1 = this.destruct.get( (n-1) / 2 );
            int pos2 = this.destruct.get( (n+1) / 2 );
            result = (double) (pos1 + pos2) / 2;
        }
        return result;
    }

    public double getAvg() {
        return this.destruct.stream()
                .mapToInt(d -> ((Number) d).intValue())
                .average()
                .orElse(0.0);
    }
}
