import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CsvLineCounter {

    public static Long countLinesFromFile(Path filePath) throws IOException {
        long lines = Files.lines(filePath).count();
        return lines;
    }
}
