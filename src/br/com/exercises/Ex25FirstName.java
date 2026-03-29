//program that reads a full name (a single line) and displays only the first name (up to the first space).

package br.com.exercises;

import java.util.Scanner;

public class Ex25FirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine().toUpperCase().split(" ")[0];
        //.split() -> quebra a String onde tiver um espaço em branco
        //[0] -> pega a primeira parte da String quebrada

        System.out.printf("First name: %s.", fullName);
        sc.close();
    }
}
