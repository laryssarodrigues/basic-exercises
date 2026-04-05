/* program that reads a full name and tells how many characters it has (including spaces).
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 29/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex21NumberCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();
        int chars = fullName.length();

        System.out.printf("The name has %d characters.", chars);
    }
}
