package it.academy.java.sprint1.tasca5.n1exercisi2;

import java.io.File;
import java.io.IOException;

public class Exercisi2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Tasca 05. Testing (Spring1), Nivell 1, Exercisi 2");
        String directoryPath = "C:/Users/ljimenezubillus/Desktop/Curs IT A";

        File currentDir = new File(directoryPath); // current directory
        directoryFiles(currentDir);
    }

    public static void directoryFiles(File directoryPath) throws IOException {
        try {
            File[] files = directoryPath.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("D:" + file.getName());
                    directoryFiles(file);
                } else {
                    System.out.println("F:" + file.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
