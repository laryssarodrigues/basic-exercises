//program that reads a line entered by the user and counts the vowels in a sentence, ignoring case.

package br.com.exercises;

import java.util.Scanner;

public class Ex33VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a line: ");
        String line = sc.nextLine().toUpperCase();

        int totalVowel = 0;
        for (int i = 0; i <= line.length() - 1; i++) { //codigo vai ate a ultima posiçao valida (outra maneira seria: i < line.length)
            char c = line.charAt(i); //pega o caractere na posiçao i

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                totalVowel++;
            }
        }
        System.out.printf("There are %d vowels.", totalVowel);
        sc.close();
    }
}
