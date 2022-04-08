import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week3.assignment1.service.CentralTendencyService;

import java.io.IOException;

public class CentralTendencyServiceTests {
    private CentralTendencyService service;

    @BeforeEach
    public void init() throws IOException {
        service = new CentralTendencyService();
    }

    @Test
    @DisplayName("Should return average")
    public void avgPositive() {
        double avg = service.getAvg();
        Assertions.assertEquals(8.318181818181818, avg);
    }

    @Test
    @DisplayName("Should return median")
    public void medianPositive() {
        double median = service.getMedian();
        Assertions.assertEquals(8.0, median);
    }

    @Test
    @DisplayName("Should return mods")
    public void modsPositive() {
        int mods = service.getModusOne()[0];
        Assertions.assertEquals(7.0, mods);
    }
}
