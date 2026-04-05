//program that reads two integers and displays the larger one or whether they are equal.

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex04GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number1 = sc.nextInt();

        System.out.print("Enter another integer: ");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.printf("The largest number is: %d", number1);
        } else if (number2 > number1){
            System.out.printf("The largest number is: %d.", number2);
        } else {
            System.out.print("The numbers are equal.");
        }

        sc.close();
    }
}
