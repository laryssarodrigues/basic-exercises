/* reads 10 integers into an array and counts how many are negative.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 30/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex34NegativeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        int counter = 0;
        for (int i = 0; i < 10; i++) { //guarda os numeros digitados no array numbers
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            numbers[i] = number;
            if (number < 0) {
                counter++;
            }
        }

        System.out.printf("There are %d negatives: ", counter);
        //o loop ja entrega cada elemento diretamente na variavel number
        //quando precisar da posiçao, usar o for
        for (int number : numbers) { //percorre cada elemento do array numbers
            if (number < 0) {
                System.out.print(number + " ");
            }
        }
        sc.close();
    }
}
