package dev.rayraydev;

import java.util.Scanner;
import java.io.*;

public class LogParser {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("logs.log");
        Scanner scanner = new Scanner(file);
        int severeCount = 0;
        int warningCount = 0;
        int infoCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("SEVERE")) {
                severeCount++;
            } else if (line.contains("WARNING")) {
                warningCount++;
            } else if (line.contains("INFO")) {
                infoCount++;
            }
        }
        System.out.println("Severe log messages: " + severeCount);
        System.out.println("Warning log messages: " + warningCount);
        System.out.println("Info log messages: " + infoCount);
    }
}
