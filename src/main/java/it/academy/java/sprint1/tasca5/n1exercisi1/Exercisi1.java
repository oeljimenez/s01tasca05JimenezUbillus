package it.academy.java.sprint1.tasca5.n1exercisi1;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercisi1 {

    public static void main(String[] args) {
        System.out.println("Tasca 05. Testing (Spring1), Nivell 1, Exercisi 1");
        String directoryPath= "C:/Users/ljimenezubillus/Desktop/Curs IT A";
        directoryFiles(directoryPath).stream().forEach(System.out::println);
    }

    public static List<String> directoryFiles(String directoryPath){
        return Stream.of(new File(directoryPath).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toList());
    }
}
