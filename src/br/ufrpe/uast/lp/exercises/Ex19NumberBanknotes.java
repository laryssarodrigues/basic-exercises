/* reads a value and calculates the minium number of banknotes needed
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 01/04/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex19NumberBanknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount (R$): ");
        int realValue = sc.nextInt();

        if (realValue <= 0) {
            System.out.print("Invalid value! Please enter a positive number.");
            return;
        }

        int nota200, nota100, nota50, nota20, nota10, nota5, nota2;
        int remaining = realValue;

        nota200 = remaining / 200;
        remaining = remaining % 200;

        nota100 = remaining / 100;
        remaining = remaining % 100;

        nota50 = remaining / 50;
        remaining = remaining % 50;

        nota20 = remaining / 20;
        remaining = remaining % 20;

        nota10 = remaining / 10;
        remaining = remaining % 10;

        nota5 = remaining / 5;
        remaining = remaining % 5;

        nota2 = remaining / 2;
        remaining = remaining % 2;

        if (remaining == 0) {
            System.out.printf("""
                        For the amount of R$%d.00, you need:
                        %d note(s) of 200,
                        %d note(s) of 100,
                        %d note(s) of 50,
                        %d note(s) of 20,
                        %d note(s) of 10,
                        %d note(s) of 5,
                        %d note(s) of 2.""",
                    realValue, nota200, nota100, nota50, nota20, nota10, nota5, nota2);
        } else {
            System.out.print("Error! This amount cannot be decomposed with the available banknotes.");
        }
        sc.close();
    }
}
