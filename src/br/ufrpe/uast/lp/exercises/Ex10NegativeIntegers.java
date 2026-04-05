/* program that reads 10 integers and reports how many are negative.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 25/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex10NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            if (number < 0) {
                cont++;
            }
        }

        System.out.printf("There are %d negative numbers.", cont);
        sc.close();
    }
}
