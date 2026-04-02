//reads a text and replaces a word with another

package br.com.exercises;

import java.util.Scanner;

public class Ex30TextReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Word that will be replaced: ");
        String replacedWord = sc.nextLine();

        System.out.print("Replacement word: ");
        String replacementWord = sc.nextLine();

        System.out.print(sentence.replace(replacedWord, replacementWord));
        //.replace(substituir,substituto): nao modifica a Str original
        sc.close();
    }
}
