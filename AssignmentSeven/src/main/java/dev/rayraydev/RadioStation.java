package dev.rayraydev;

public class RadioStation {
    protected String radioCallSign = null;
    protected double radioStationFrequency = 0;

    public RadioStation() {

    }

    public RadioStation(String rCS, double rSF) throws RadioStationException {
        radioCallSign = rCS.toUpperCase();
        radioStationFrequency = rSF;
        validateCallSign(radioCallSign);
        validateStationFrequency(radioStationFrequency);
    }

    public void validateCallSign(String radioCallSign) throws RadioStationException {
        for (int j = 0; j < radioCallSign.length(); j++) {
            if (Character.isDigit(radioCallSign.charAt(j))) {
                throw new RadioStationException("\nEXCEPTION in RadioStation: Station call signs must only consist of letters. Unable to create radio station object!");
            }
        }

        if (radioCallSign.length() != 4) {
            throw new RadioStationException("\nEXCEPTION in RadioStation: Station call signs must contain exactly four (4) letters. Detected more or less than four (4) letters. Unable to create radio station object!");
        }
    }

    public void validateStationFrequency(double radioStationFrequency) throws RadioStationException {
        if (radioStationFrequency < 88.0 || radioStationFrequency > 108.0) {
            throw new RadioStationException("\nEXCEPTION in RadioStation: The station frequency must be within 88.0 and 108.0, inclusive. The inputted frequency is not within this range. Unable to create radio station object!");
        }
    }

    public String toString() {
        String radioStationInfo = "\nRadio Station's Call Sign: " + radioCallSign + "\nRadio Station's Frequency: " + radioStationFrequency;
        return radioStationInfo;
    }
}
