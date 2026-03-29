//program that reads a positive integer N and displays the sum of all odd numbers from 1 to N.

package br.com.exercises;

import java.util.Scanner;

public class Ex07SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid value!");
            return;
        }

        int cont = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) { //verifica se cada numero da vez (i) é ímpar
                if (i == number || i == (number - 1)) { //se number for o ultimo ímpar (N = ímpar) ou number - 1 (N = par)
                    System.out.print(i);
                } else {
                    System.out.print(i + " + ");
                }
                cont += i; //soma os numeros ímpares
            }
        }
        System.out.printf(" = %d", cont);
        sc.close();
    }
}
