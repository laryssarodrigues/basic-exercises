//reads a line and counts how many times 'a' or 'A' appears

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex23AmountOfA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a line: ");
        String line = sc.nextLine().toLowerCase();

        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter == 'a') {
                counter++;
            }
        }
        System.out.printf("aparece %d vezes", counter);
    }
}
