//reads a sentence and checks if it is a palindrome

package br.com.exercises;

import java.util.Scanner;

public class Ex29Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        String formattedSentence = sentence.replaceAll("\\s+", "");

        String inverted = "";
        for (int i = formattedSentence.length() - 1; i >= 0; i--) {
            char c = formattedSentence.charAt(i);
            inverted += c;
        }

        if (formattedSentence.equals(inverted)) {
            System.out.printf("The phrase \"%s\" is a palindrome (%s -> %s).%n", sentence, formattedSentence, inverted);
        } else {
            System.out.printf("The phrase \"%s\" is not a palindrome.", sentence);
        }
    }
}
