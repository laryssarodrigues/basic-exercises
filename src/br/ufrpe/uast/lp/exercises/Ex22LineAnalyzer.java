/* reads a line and prints its length, first/last character, and uppercase/lowercase versions.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 30/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex22LineAnalyzer {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Type a line: ");
        String line = sc.nextLine();

        if (line.isEmpty()) { //.isEmpty -> metodo que verifica se a Str está vazia (true = length 0 | false = >=1 char)
            System.out.println("Invalid value, please enter something!");
            return;
        }

        System.out.println("Line size: " + line.length());
        System.out.println("First character: " + line.charAt(0));
        System.out.println("Last character: " + line.charAt(line.length() - 1));
        System.out.println("Uppercase line: " + line.toUpperCase());
        System.out.println("Lowercase line: " + line.toLowerCase());

        sc.close();
    }
}
