package org.example;

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
}
