//reads N numbers and searches for a target value

package br.com.exercises;

import java.util.Scanner;

public class Ex35ElementFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numberDigits = sc.nextInt();
        int[] numbers = new int[numberDigits];

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print("Enter the " + (i+1) + "° number: ");
            int number = sc.nextInt();
            numbers[i] = number;
        }

        System.out.print(">> Search number: ");
        int searchNum = sc.nextInt();

        boolean found = false;
        int index = -1;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == searchNum) {
                found = true;
                index = j;
                break;
            }
        }

        if (found) {
            System.out.print("Target number index: " + index);
        } else {
            System.out.print("Number not found!");
        }
        sc.close();
    }
}
