/* program that reads a temperature in Celsius and converts it to Fahrenheit.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 25/03/26
 */

package br.ufrpe.uast.lp.exercises;

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
