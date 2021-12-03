import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Day1 {
    public List<Integer> fileContents = new ArrayList<>();
    public Integer increaseCount = 0;

    public void fileDataToList(String pathString) {
        Path path = Paths.get(pathString);
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(line -> fileContents.add(Integer.parseInt(line)));
        } catch (IOException exception) {
            System.out.println("it didn't work?");
        }
    }

    public void countNumberIncreases(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if ((numbers.get(i)) < numbers.get(i + 1)) {
                increaseCount += 1;
            }
        }
    }

    public void countSlidingWindowIncreases(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 3; i++) {
            int currentTotal = numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2);
            int nextTotal = numbers.get(i + 1) + numbers.get(i + 2) + numbers.get(i + 3);

            if (currentTotal < nextTotal) {
                increaseCount += 1;
            }
        }
    }
}
