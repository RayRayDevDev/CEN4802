package dev.rayraydev;

import java.util.Random;
import java.util.logging.*;

public class LoggingExample {
    private static final Logger LOGGER = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        LOGGER.setLevel(Level.ALL);
        try {
            FileHandler fileHandler = new FileHandler("logs.log");
            fileHandler.setLevel(Level.ALL);
            LOGGER.addHandler(fileHandler);
        } catch (Exception e) {
            LOGGER.warning("Unable to create logfile for some reason...");
        }

        Random rand = new Random();
        int min = 1;
        int max = 100;

        for (int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt((max - min) + 1) + min;
            if (randomNumber % 5 == 0) {
                LOGGER.log(Level.SEVERE, "Yikes! Error Code: " + randomNumber);
            } else if (randomNumber % 4 == 0) {
                LOGGER.log(Level.WARNING, "Eh. Warning Code: " + randomNumber);
            } else {
                LOGGER.log(Level.INFO, "Everything is AMAZING! Info Code: " + randomNumber);
            }
        }

    }
}
