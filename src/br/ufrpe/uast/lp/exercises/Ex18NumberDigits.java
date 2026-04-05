/* program that reads a positive integer and counts how many digits it has.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 29/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex18NumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.print("Invalid value!");
        } else if (number == 0) {
            System.out.println("Number of digits: 1");
        } else {
            int cont = 0;
            while (number > 0) {
                number = number / 10;
                cont++;
            }
            System.out.printf("Number of digits: %d.", cont);
        }
        sc.close();
    }
}
