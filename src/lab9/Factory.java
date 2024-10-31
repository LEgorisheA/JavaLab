package lab9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Factory {
    public static Stream<Integer> getTemperature() {
        return Stream.of(-2, -5, -2, -4, 3, -6, -2,
                -1, 5, 1, 1, 0, -1, 0, 3, -1, 2, 5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11);
    }

    public static Stream<String> getWords() {
        Stream<String> inputFile = Stream.empty();
        try {
            inputFile = Stream.of(Files.lines(Paths.get(
                    "C:\\Users\\Mi\\IdeaProjects\\study\\src\\lab9\\text.txt")).reduce(
                            (s1 ,s2) -> s1 + " " + s2).get().split("[\s,]+"));
        } catch (IOException ioe) {
            System.out.println("Ошибка: " + ioe);
            System.exit(0);
        }
        return inputFile;
    }

}
