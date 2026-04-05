/* reads 5 integers into an array and calculates the average.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 30/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex32ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5]; //array com capacidade de 5 numeros

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) { //lê 5 inteiros e guarda no array
            System.out.print("Enter the " + (i + 1) + "° number: ");
            int number = sc.nextInt();
            numbers[i] = number;
            sum += numbers[i]; //soma os numeros do array
        }

        System.out.print(">> Numbers typed: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.printf("\nTotal sum: %.1f", sum);
        System.out.printf("\nThe average is: %.1f", (sum / numbers.length)); //media = soma / tamanho do array
        sc.close();
    }
}
