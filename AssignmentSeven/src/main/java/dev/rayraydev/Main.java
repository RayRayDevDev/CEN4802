package dev.rayraydev;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        RadioStation[] stationArray = new RadioStation[5];
        Scanner userInput = new Scanner(System.in);
        int i = 0;
        int k = 0;
        do {
            try {
                RadioStation newRadioStation = new RadioStation();
                out.print("\nWelcome! Please enter the call sign of the radio station you'd like to listen to. Please enter only letters and ensure that the call sign is no more than four (4) letters in length:  ");
                newRadioStation.radioCallSign = userInput.next();
                newRadioStation.validateCallSign(newRadioStation.radioCallSign);
                out.print("\nNext, please enter the carrier frequency of the desired radio station. Please note that the frequency cannot be below 88 or above 108: ");
                try {
                    newRadioStation.radioStationFrequency = userInput.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\n\nYou did not enter a number. Please try again.");
                    break;
                }
                newRadioStation.validateStationFrequency(newRadioStation.radioStationFrequency);
                stationArray[i] = new RadioStation(newRadioStation.radioCallSign, newRadioStation.radioStationFrequency);
                i++;
            } catch(RadioStationException e) {
                out.println(e.getMessage());
            }
        } while(i < stationArray.length);
        for(k = 0; k < stationArray.length; k++) {
            out.println(stationArray[k]);
        }
    }
}
