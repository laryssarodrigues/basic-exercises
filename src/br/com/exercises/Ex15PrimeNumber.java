//program that reads a positive integer and reports whether it is prime or not.

package br.com.exercises;

import java.util.Scanner;

public class Ex15PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error! The number needs to be positive. ");
            return;
        }

        if (number == 1) {
            System.out.println("Not prime!");
        } else if (number == 2) {
            System.out.println("Is prime!");
        } else if (number % 2 == 0) {
            System.out.println("Not prime!");

        } else {
            boolean isPrime = true; //assume que é primo ate provar contrario
            for (int i = 3; i <= (number - 1); i++) {
                if (number % i == 0) { //verifica divisores impares
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Is prime!");
            } else {
                System.out.println("Not prime!");
            }
        }
        sc.close();
    }
}
