package edu.epam.task.array_reading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileScanner {

    static String filename = "scann.txt";

    public static void scanFile() {

        try {

            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);

                while (scan.hasNext()) {//чтение из файла

                    if (scan.hasNextDouble()) {
                        System.out.println(scan.nextDouble() + " : double");
                    }
                    else if (scan.hasNextInt()) {
                        System.out.println(scan.nextInt() + " : int");
                    }
                    else if (scan.hasNextBoolean()) {
                        System.out.println(scan.nextBoolean() + " : boolean");
                    }
                    else {
                        System.out.println(scan.next() + " : String");
                    }
                }
            } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }

}