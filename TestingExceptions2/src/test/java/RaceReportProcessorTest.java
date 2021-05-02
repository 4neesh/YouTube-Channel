import com.googlecode.catchexception.CatchException;
import org.junit.Test;

import java.io.FileNotFoundException;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RaceReportProcessorTest {

    @Test
    public void generateReportDriverFileThrowsFileNotFound() throws Exception{

        RaceReportProcessor reportProcessor = new RaceReportProcessor();
        String driverFile = "drivers/drivers.csv";
        String raceFile = "racePerformance/race.csv";

        catchException(reportProcessor).generateReport(driverFile, raceFile);

        assertTrue(caughtException() instanceof FileNotFoundException);
        assertEquals("drivers/drivers.csv (No such file or directory)", caughtException().getMessage());

    }

}
