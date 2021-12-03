import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class day1Test {

    @Test
    public void fileDataExtractedAsExpected() {
        List<Integer> expected = Arrays.asList(199, 200, 208, 210);

        day1.fileDataToList("./src/main/resources/exampleData.txt");

        assertEquals(String.valueOf(expected), String.valueOf(day1.fileContents.subList(0, 4)));
    }
}