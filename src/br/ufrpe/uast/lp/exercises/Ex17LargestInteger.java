/* program that reads three integers and displays the largest one.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 29/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex17LargestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.printf(">>> Largest number: %d", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf(">>> Largest number: %d", num2);
        } else {
            System.out.printf(">>> Largest number: %d", num3);
        }
        sc.close();
    }
}
