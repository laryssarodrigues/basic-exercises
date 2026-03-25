//program that reads N integers and displays the 2 largest, the 2 smallest, or if all the numbers are equal.

package br.com.exercises;

import java.util.Scanner;

public class Ex05BiggerSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bigger1, bigger2, smaller1, smaller2;

        System.out.print("Quantify of whole numbers: ");
        int number = sc.nextInt();

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        bigger1 = num;
        bigger2 = num;
        smaller1 = num;
        smaller2 = num;

        for (int i = 2; i <= number; i++) { //i = 2 porque ja foi lido um numero fora do loop
            System.out.print("Enter an integer: ");
            int numb = sc.nextInt();

            if (numb > bigger1) {
                bigger2 = bigger1; //o antigo maior vira segundo
                bigger1 = numb; //o novo vira o maior
            } else if (numb > bigger2) {
                bigger2 = numb; //so atualiza o segundo
            }
            //se nao entrar em nenhum if, ignora

            if (numb < smaller1) {
                smaller2 = smaller1;
                smaller1 = numb;
            } else if (numb < smaller2) {
                smaller2 = numb;
            }
        }

        if (bigger1 == smaller1) {
            System.out.print("All the numbers are equal.");
        } else {
            System.out.printf("Two biggest: %d e %d", bigger1, bigger2);
            System.out.printf("\nTwo minors: %d e %d", smaller1, smaller2);
        }

        sc.close();
    }
}
