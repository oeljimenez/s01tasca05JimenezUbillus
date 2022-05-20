package it.academy.java.sprint1.tasca5.n1exercisi4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exercisi4 {

    public static void main(String[] args) throws IOException {
        System.out.println("Tasca 05. Testing (Spring1), Nivell 1, Exercisi 4");
        String directoryPath = "C:/Users/ljimenezubillus/Desktop/Curs IT A/directoris.txt";

        try (Stream<String> stream = Files.lines(Paths.get(directoryPath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
