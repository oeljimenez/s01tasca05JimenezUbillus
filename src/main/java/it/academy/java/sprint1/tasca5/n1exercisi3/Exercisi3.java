package it.academy.java.sprint1.tasca5.n1exercisi3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercisi3 {

    public static void main(String[] args) throws IOException {
        System.out.println("Tasca 05. Testing (Spring1), Nivell 1, Exercisi 3");
        String directoryPath = "C:/Users/ljimenezubillus/Desktop/Curs IT A";

        BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/ljimenezubillus/Desktop/Curs IT A/directoris.txt"));
        File currentDir = new File(directoryPath); // current directory
        directoryFiles(currentDir, out);
        out.flush();
    }

    public static void directoryFiles(File directoryPath, BufferedWriter out) throws IOException {
        try {
            File[] files = directoryPath.listFiles();
            for (File file : files) {
                out.newLine();
                if (file.isDirectory()) {
                    out.write("D:" + file.getName());
                    directoryFiles(file, out);
                } else {
                    out.write("F:" + file.getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
