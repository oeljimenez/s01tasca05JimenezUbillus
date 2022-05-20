package it.academy.java.sprint1.tasca5.n1exercisi5;

import java.io.*;

public class Exercisi5 {

    public static void main(String[] args) throws IOException {
        System.out.println("Tasca 05. Testing (Spring1), Nivell 1, Exercisi 5");
        ser();
        deSer();
    }

    private static void ser() {
        try {
            //Creating the object
            Persona persona = new Persona("leo", "jimenez", "46455520d", "bcn");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("C:/Users/ljimenezubillus/Desktop/Curs IT A/persona.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(persona);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("serialization done");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void deSer() {
        try {
            //Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/ljimenezubillus/Desktop/Curs IT A/persona.ser"));
            Persona s = (Persona) in.readObject();
            //printing the data of the serialized object
            System.out.println("\ndeserialization done");
            System.out.println(s.name + " " + s.surName + " " + s.cityOfBirth + " " + s.dni);
            //closing the stream
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
