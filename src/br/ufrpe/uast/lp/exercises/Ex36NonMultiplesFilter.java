//reads N numbers and prints those that are not multiples of M

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex36NonMultiplesFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("* Enter the number of digits: ");
        int digits = sc.nextInt();
        int[] numbers = new int[digits];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i+1) + "° number: ");
            int num = sc.nextInt();
            numbers[i] = num;
        }

        System.out.print("* Enter a number: ");
        int number = sc.nextInt();

        String notMult = "";
        for (int j = 0; j <= numbers.length - 1; j++) {
            if ((numbers[j] % number) != 0) { //nao multiplos
                notMult += numbers[j] + " | ";
            }
        }

        if (notMult.isEmpty()) {
            System.out.print("All are multiples!");
        } else {
            System.out.println("Not multiple: | " + notMult);
        }
        sc.close();
    }
}
