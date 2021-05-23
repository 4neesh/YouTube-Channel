import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;

public class CsvLineCounterTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void countLines() throws IOException {
            File file = temporaryFolder.newFile("./test.csv");
            String csvData = "a,b,c\nd,e,f\ng";
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(csvData);
            bw.close();

            long actualLines = CsvLineCounter.countLinesFromFile(file.toPath());

            assertEquals(3, actualLines);
    }
}
