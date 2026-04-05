/* program that reads an integer N and displays all the numbers from 1 to N, one per line.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 25/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex09DisplayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
