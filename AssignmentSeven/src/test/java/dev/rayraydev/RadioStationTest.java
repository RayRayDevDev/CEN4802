package dev.rayraydev;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioStationTest {

    @Test
    void testValidateCallSignWithDigits() {
        RadioStation radioStation = new RadioStation();
        try {
            radioStation.validateCallSign("KDKA2");
            fail("Expected RadioStationException to be thrown");
        } catch (RadioStationException e) {
            assertEquals("\nEXCEPTION in RadioStation: Station call signs must only consist of letters. Unable to create radio station object!", e.getMessage());
        }
    }

    @Test
    void testValidateCallSignWithInvalidLength() {
        RadioStation radioStation = new RadioStation();
        try {
            radioStation.validateCallSign("KD");
            fail("Expected RadioStationException to be thrown");
        } catch (RadioStationException e) {
            assertEquals("\nEXCEPTION in RadioStation: Station call signs must contain exactly four (4) letters. Detected more or less than four (4) letters. Unable to create radio station object!", e.getMessage());
        }
    }

    @Test
    void testValidateCallSignWithValidInput() {
        RadioStation radioStation = new RadioStation();
        try {
            radioStation.validateCallSign("KDKA");
        } catch (RadioStationException e) {
            fail("Unexpected RadioStationException was thrown: " + e.getMessage());
        }
    }

    @Test
    void testValidateStationFrequencyWithInvalidInput() {
        RadioStation radioStation = new RadioStation();
        try {
            radioStation.validateStationFrequency(200.0);
            fail("Expected RadioStationException to be thrown");
        } catch (RadioStationException e) {
            assertEquals("\nEXCEPTION in RadioStation: The station frequency must be within 88.0 and 108.0, inclusive. The inputted frequency is not within this range. Unable to create radio station object!", e.getMessage());
        }
    }

    @Test
    void testValidateStationFrequencyWithValidInput() {
        RadioStation radioStation = new RadioStation();
        try {
            radioStation.validateStationFrequency(95.0);
        } catch (RadioStationException e) {
            fail("Unexpected RadioStationException was thrown: " + e.getMessage());
        }
    }

    @Test
    void testStationArray() throws RadioStationException {
        RadioStation[] stationArray = new RadioStation[6];
        stationArray[0] = new RadioStation("WQAM", 102.7);
        stationArray[1] = new RadioStation("WIOD", 89.5);
        stationArray[2] = new RadioStation("WAXY", 95.7);
        stationArray[3] = new RadioStation("WSVN", 101.5);
        stationArray[4] = new RadioStation("WLRN", 91.3);
        stationArray[5] = new RadioStation("WINZ", 106.7);
        assertEquals("Radio Station's Call Sign: WQAM\nRadio Station's Frequency: 102.7", stationArray[0].toString().trim());
        assertEquals("Radio Station's Call Sign: WIOD\nRadio Station's Frequency: 89.5", stationArray[1].toString().trim());
        assertEquals("Radio Station's Call Sign: WAXY\nRadio Station's Frequency: 95.7", stationArray[2].toString().trim());
        assertEquals("Radio Station's Call Sign: WSVN\nRadio Station's Frequency: 101.5", stationArray[3].toString().trim());
        assertEquals("Radio Station's Call Sign: WLRN\nRadio Station's Frequency: 91.3", stationArray[4].toString().trim());
        assertEquals("Radio Station's Call Sign: WINZ\nRadio Station's Frequency: 106.7", stationArray[5].toString().trim());
    }




}
