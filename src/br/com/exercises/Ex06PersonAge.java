//program that reads a person's age and checks if they are of legal age or a minor.

package br.com.exercises;

import java.util.Scanner;

public class Ex06PersonAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Under age.");
        } else {
            System.out.println("Of legal age.");
        }
    }
}
