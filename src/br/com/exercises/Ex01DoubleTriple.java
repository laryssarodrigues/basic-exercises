//program that reads an integer and displays its double and its triple.

package br.com.exercises;

import java.util.Scanner;

public class Ex01DoubleTriple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int numberInt = sc.nextInt();

        System.out.printf("Twice that number is %d, and three times that number is %d",
                (numberInt * 2), (numberInt * 3));

        sc.close();
    }
}
