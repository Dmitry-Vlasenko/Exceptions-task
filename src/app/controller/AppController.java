package app.controller;

import app.model.task;
import app.utils.CustomException;

import java.util.Scanner;

public class AppController {
    private static final int MIN_ALTITUDE = 120;
    private static final int MAX_ALTITUDE = 355;
    private static final String message = "Enter the current altitude between " + MIN_ALTITUDE + " and " + MAX_ALTITUDE + " meters" ;
    static Scanner scanner = new Scanner(System.in);

    public void Processing() {
        System.out.println(message);
        while (true) {
            try {
                int altitude = scanner.nextInt();
                task.checkAltitude(altitude, MIN_ALTITUDE, MAX_ALTITUDE);
                System.out.println("Altitude is within valid range: " + altitude);
                System.out.println("Do you want to continue? yes/no");
                String continueInput = scanner.next();
                if (!continueInput.equalsIgnoreCase("yes")) {
                    break;
                }
            } catch (CustomException.AltitudeOutOfRangeException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Do you want to continue? yes/no");
                String continueInput = scanner.next();
                if (!continueInput.equalsIgnoreCase("yes")) {
                    break;
                }
            }
        }
    }
}