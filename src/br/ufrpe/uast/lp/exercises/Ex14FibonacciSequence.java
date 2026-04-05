/* program that reads a number N and displays the first N terms of the Fibonacci sequence.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 28/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex14FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int t1 = 0;
        if (number == 1) {
            System.out.print(t1);
        } else {
            int t2 = 1;
            System.out.printf("%d -> %d", t1, t2);

            int t3;
            for (int i = 3; i <= number; i++) {
                t3 = t1 + t2;
                System.out.printf(" -> %d", t3);
                t1 = t2;
                t2 = t3;
            }
        }
        sc.close();
    }
}
