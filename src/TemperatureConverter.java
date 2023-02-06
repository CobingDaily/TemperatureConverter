import temperature.Temperature;
import temperature.TemperatureFactory;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class TemperatureConverter {
    private static final String[] VALID_UNITS = { "F", "C", "K", "R" };

    public static void main(String[] args) throws IllegalAccessException, IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Press '1' to manually convert a temperature unit");
        System.out.println("Press '2' to convert a .txt file");
        System.out.println("Press '3' to end the program");
        int taskOptions = input.nextInt();

        if (taskOptions == 1) {
            System.out.println("Enter Temperature Unit (F, C, K, R): ");
            String initialUnit = input.next();
            if (!Arrays.asList(VALID_UNITS).contains(initialUnit))
                throw new IllegalAccessException(initialUnit + " is an invalid unit");

            System.out.println("Enter Temperature Value: ");
            double value = input.nextDouble();

            System.out.println("Enter Temperature Unit (F, C, K, R): ");
            String conversionUnit = input.next();
            if (!Arrays.asList(VALID_UNITS).contains(conversionUnit))
                throw new IllegalAccessException(conversionUnit + " is an invalid unit");

            Temperature temperature = TemperatureFactory.CreateTemperature(initialUnit, value);

            temperature.printUnit(conversionUnit);
        }
        else if (taskOptions == 2) {
            String documentName = "temptest.txt";

            Path currentDir = Paths.get("");
            File textFile =  new File(currentDir.toAbsolutePath() + "/" + documentName);

            BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arguments = line.split(" ");

                double value = Double.parseDouble(arguments[0]);
                String initialUnit = arguments[1].toUpperCase();
                String conversionUnit = arguments[2].toUpperCase();

                if (!Arrays.asList(VALID_UNITS).contains(initialUnit)) {
                    System.out.println(initialUnit + " is an unknown unit \n");
                    continue;
                }

                if (!Arrays.asList(VALID_UNITS).contains(conversionUnit)) {
                    System.out.println(conversionUnit + " is an unknown unit \n");
                    continue;
                }

                System.out.println(initialUnit + " => " + conversionUnit + ": ");
                Temperature temperature = TemperatureFactory.CreateTemperature(initialUnit, value);
                temperature.printUnit(conversionUnit);
                System.out.println();
            }
        }
        else {
            System.exit(0);
        }

    }
}
