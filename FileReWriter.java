package edu.epam.task.array_reading;

import java.io.FileWriter;
import java.io.IOException;

public class FileReWriter {

    static String filename = "scan.txt";

    public static void makeFile() {

        try {
            FileWriter fw = new FileWriter(filename); //создание потока для записи
            fw.write("Some text"); //запись данных
            fw.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
