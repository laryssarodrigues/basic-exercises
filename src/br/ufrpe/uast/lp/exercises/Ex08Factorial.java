/* program that reads a positive integer and calculates its factorial using a <for> loop.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 26/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex08Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int factorial = 1;
        for (int i = number; i >= 1; i--) { //começa do number e vai ate 1
            if (i > 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
            factorial *= i;
        }

        System.out.printf(" = %d", factorial);
        sc.close();
    }
}
