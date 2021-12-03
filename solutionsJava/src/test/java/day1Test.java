import org.junit.jupiter.api.BeforeEach;
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

    Day1 day1;

    @BeforeEach
    void setUp() {
        day1 = new Day1();
    }

    @Test
    public void fileDataExtractedAsExpected() {
        List<Integer> expected = Arrays.asList(199, 200, 208, 210);
        day1.fileDataToList("./src/main/resources/exampleDataPt1.txt");
        assertEquals(String.valueOf(expected), String.valueOf(day1.fileContents.subList(0, 4)));
    }

    @Test
    public void nextNumberIsHigherWindowSize1() {
        List<Integer> numbers = Arrays.asList(1, 2);
        day1.countNumberIncreases(numbers);
        assertEquals(1, day1.increaseCount);
    }

    @Test
    public void nextNumberIsLowerWindowSize1() {
        List<Integer> numbers = Arrays.asList(10, 3);
        day1.countNumberIncreases(numbers);
        assertEquals(0, day1.increaseCount);
    }

    @Test
    public void rightAnswerForExampleDataWindowSize1() {
        day1.fileDataToList("./src/main/resources/exampleDataPt1.txt");
        List<Integer> numbers = day1.fileContents;
        day1.countNumberIncreases(numbers);
        assertEquals(7, day1.increaseCount);
    }

    @Test
    public void nextWindowIsHigher() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        day1.countSlidingWindowIncreases(numbers);
        assertEquals(1, day1.increaseCount);
    }

    @Test
    public void nextWindowIsTheSame() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1);
        day1.countSlidingWindowIncreases(numbers);
        assertEquals(0, day1.increaseCount);
    }

    @Test
    public void rightAnswerForExamplePart2() {
        day1.fileDataToList("./src/main/resources/exampleDataPt2.txt");
        List<Integer> numbers = day1.fileContents;
        day1.countSlidingWindowIncreases(numbers);
        assertEquals(5, day1.increaseCount);
    }
}