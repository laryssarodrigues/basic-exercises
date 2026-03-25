//program that reads a temperature in Celsius and converts it to Fahrenheit.

package br.com.exercises;

import java.util.Scanner;

public class Ex02TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in °C: ");
        double temperatureC = sc.nextDouble();

        System.out.printf("Converting to Fahrenheit, it becomes: %.1f.", ((temperatureC * 9 / 5) + 32));

        sc.close();
    }
}
