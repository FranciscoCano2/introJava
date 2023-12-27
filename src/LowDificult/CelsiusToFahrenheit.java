package LowDificult;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public float temperatureConverter() {

        Scanner scanner = new Scanner(System.in);
        float celsius;
        System.out.println("Enter Celsius degrees: ");
        celsius = scanner.nextFloat();
        return 32 + (celsius * 9 / 5);

    }

}
