package edu.epam.task.array_reading;

public class ScannerLogic {

    static String filename = "scan.txt";

    public static void main(String[] args) {

        FileReWriter.makeFile();
        FileScanner.scanFile();

        }
}
