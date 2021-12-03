import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class day1 {
    public static List<Integer> fileContents = new ArrayList<>();

    public static void fileDataToList(String pathString) {
        Path path = Paths.get(pathString);
        try (Stream<String> lines = Files.lines(path)) {

            lines.forEach(line -> fileContents.add(Integer.parseInt(line)));

        } catch (IOException exception) {
            System.out.println("why didn't it work?");
        }
    }


}
