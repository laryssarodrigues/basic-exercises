//program that reads a full name and tells how many characters it has (including spaces).

package br.com.exercises;

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
