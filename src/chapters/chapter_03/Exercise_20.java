package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_20 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double temperature;
		double windSpeed;
		double index;

		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		temperature = input.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		windSpeed = input.nextDouble();

		if (temperature < -58 || temperature > 41 || windSpeed < 2) {
			if (temperature < -58 || temperature > 41)
				System.out.println("Temperature value is not valid");
			if (windSpeed < 2)
				System.out.println("Windspeed value is not valid");
		} else {
			index = (35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16))
					+ (0.4275 * temperature * Math.pow(windSpeed, 0.16)));

			System.out.println("The wind chill index is " + index);
		}

	}

}
