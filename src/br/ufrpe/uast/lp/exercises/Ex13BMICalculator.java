//program that reads a person's weight (kg) and height (m) and calculates their BMI.

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex13BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Height (m): ");
        double height = sc.nextDouble();

        System.out.printf("BMI: %.2f", (weight / (height * height)));
    }
}
