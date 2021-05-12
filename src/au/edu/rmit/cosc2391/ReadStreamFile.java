package au.edu.rmit.cosc2391;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadStreamFile {
    public static void main(String args[]) throws IOException {
        Stream<String> rows= Files.lines(Paths.get("marks.txt"));
        rows.distinct().filter(x -> Integer.parseInt(x.split(" ")[1]) >= 80).
                filter(x -> Integer.parseInt(x.split(" ")[3]) >= 80).
                filter(x -> Integer.parseInt(x.split(" ")[2]) >= 30).
                sorted((x1, x2) -> Integer.parseInt(x1.split(" ")[1]) + Integer.parseInt(x1.split(" ")[3])
                - Integer.parseInt(x2.split(" ")[1]) - Integer.parseInt(x2.split(" ")[3])).
                forEach(System.out::println);
        rows.close();

    }
}
