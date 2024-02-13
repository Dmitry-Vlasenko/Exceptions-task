package app.utils;

public class CustomException {
    public static class AltitudeOutOfRangeException extends Exception {
        public AltitudeOutOfRangeException(String message) {
            super(message);
        }
    }
}
