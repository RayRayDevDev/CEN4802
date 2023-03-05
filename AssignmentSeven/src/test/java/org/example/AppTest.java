package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioStationTest {

    @Test
    void testValidateCallSignWithDigits() {
        RadioStation radioStation = new RadioStation();
        assertThrows(RadioStationException.class, () -> {
            radioStation.validateCallSign("WABC123");
        });
    }

    @Test
    void testValidateCallSignWithMoreThan4Letters() {
        RadioStation radioStation = new RadioStation();
        assertThrows(RadioStationException.class, () -> {
            radioStation.validateCallSign("WABCDE");
        });
    }

    @Test
    void testValidateCallSignWithLessThan4Letters() {
        RadioStation radioStation = new RadioStation();
        assertThrows(RadioStationException.class, () -> {
            radioStation.validateCallSign("WAB");
        });
    }

    @Test
    void testValidateCallSignValid() throws RadioStationException {
        RadioStation radioStation = new RadioStation();
        radioStation.validateCallSign("WABC");
    }

    @Test
    void testValidateStationFrequencyBelow88() {
        RadioStation radioStation = new RadioStation();
        assertThrows(RadioStationException.class, () -> {
            radioStation.validateStationFrequency(87.9);
        });
    }

    @Test
    void testValidateStationFrequencyAbove108() {
        RadioStation radioStation = new RadioStation();
        assertThrows(RadioStationException.class, () -> {
            radioStation.validateStationFrequency(108.1);
        });
    }

    @Test
    void testValidateStationFrequencyValid() throws RadioStationException {
        RadioStation radioStation = new RadioStation();
        radioStation.validateStationFrequency(90.5);
    }
}
