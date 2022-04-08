package week3.assignment1.state;

import week3.assignment1.service.CentralTendencyService;

import java.io.IOException;

public enum Action {
    EXIT,
    BACK,
    GENERATE_ALL,
    GENERATE_MODUS,
    GENERATE_AVG_MEDIAN,
    READ_CSV;

    public static void execute(Store store, Action action) throws IOException {
        CentralTendencyService centralTendencyService = new CentralTendencyService();

        switch (action) {
            case BACK:
                store.setSelectedMenu(null);
                break;
            case EXIT:
                System.out.println("Program exit 1");
                store.setContinue(false);
                break;
            case GENERATE_ALL:
                System.out.println("Generate all files");
                centralTendencyService.generateAll();
                break;
            case GENERATE_AVG_MEDIAN:
                centralTendencyService.generateAvgMedian();
                break;
            case GENERATE_MODUS:
                centralTendencyService.generateModus();
                break;
            case READ_CSV:
                centralTendencyService.readCSV();
                break;
        }
    }
}
