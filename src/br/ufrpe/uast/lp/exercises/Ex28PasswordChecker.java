/* reads a password and checks if it matches "segredo123", printing access allowed or invalid password.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 30/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex28PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "segredo123";

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        //== compara se os dois obj's sao o mesmo na memoria (se apontam para mesmo endereço, e nao se tem o mesmo texto)
        if (password.equals(correctPassword)) { //.equals - > compara o conteudo da Str
            System.out.println("Access allowed!");
        } else {
            System.out.println("Invalid password!");
        }
        sc.close();
    }
}
