/* program that reads a letter and indicates whether it is a vowel or a consonant using switch. Ignore case-sensitive/lowercase.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 28/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex16ConsonantVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = sc.next().toUpperCase().charAt(0);
        //vai ler uma String, torna maiuscula e pegar o primeiro caractere
        //ex.: "abcdh" -> pega 'A'
        //letter deixa de ser String e vira um char

        switch (letter) {
            case 'A', 'E', 'I', 'O', 'U': //verifica se o caractere é vogal
                System.out.printf("%c is a vowel.", letter); //%c imprimi um char
                break;
            default:
                if (letter >= 'A' && letter <= 'Z') { //verifica se o char ta entre 'A' e 'Z' na tabela ASCII
                    System.out.printf("%c is a consonant.", letter);
                } else { // se nao ta entre A-Z, nao é letra
                    System.out.println("Invalid value!");
                }
        }
        sc.close();
    }
}
