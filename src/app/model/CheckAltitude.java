package app.model;

import app.utils.CustomException;

public class CheckAltitude {
    public static void checkAltitude(int altitude, int MIN_ALTITUDE, int MAX_ALTITUDE) throws CustomException.AltitudeOutOfRangeException {
        if (altitude < MIN_ALTITUDE || altitude > MAX_ALTITUDE) {
            throw new CustomException.AltitudeOutOfRangeException("Altitude out of range: " + altitude);
        }
    }
}