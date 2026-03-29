//program that reads the first and surname separately and displays the initials.

package br.com.exercises;

import java.util.Scanner;

public class Ex24InitialName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: "); //lê o nome e armazena com String
        String firstName = sc.nextLine();
        char initial1 = firstName.toUpperCase().charAt(0); //pega primeira letra de cada nome e converte para maiusculo

        System.out.print("Surname: ");
        String surname = sc.nextLine();
        char initial2 = surname.toUpperCase().charAt(0);

        System.out.printf("The initials are: %c e %c.", initial1, initial2);
        sc.close();
    }
}
