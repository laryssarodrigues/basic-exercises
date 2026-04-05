/* reads a full name and prints the first and last name
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 01/04/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex26FirstLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName, lastName;

        System.out.print(">> Full name: ");
        String fullName = sc.nextLine().trim();

        if (fullName.isEmpty()) {
            System.out.println("No name, empty space!");
            return;
        }

        String[] separateNames = fullName.split("\\s+");
        if (separateNames.length < 2) {
            System.out.println("Please enter full name!");
            return;
        }
        firstName = separateNames[0];
        lastName = separateNames[separateNames.length - 1];

        System.out.printf("> First name: %s%n", firstName);
        System.out.printf("> Last name: %s", lastName);
        sc.close();
    }
}
