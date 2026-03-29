//program that reads N integers and displays the 2 largest, the 2 smallest, or if all the numbers are equal.

package br.com.exercises;

import java.util.Scanner;

public class Ex05BiggerSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bigger1, bigger2, smaller1, smaller2;

        System.out.print("Quantify of whole numbers: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.print("Add more numbers!");
            return; //mostra a mensagem e encerra o programa
        }

        System.out.print("Enter an integer: "); //primeiro numero
        int num1 = sc.nextInt();

        System.out.print("Enter an integer: "); //segundo numero
        int num2 = sc.nextInt();

        //estrutura feita para garantir quem é o maior e quem é menor
        if (num1 > num2) {
            bigger1 = num1;
            bigger2 = num2;
            smaller1 = num2;
            smaller2 = num1;
        } else {
            bigger1 = num2;
            bigger2 = num1;
            smaller1 = num1;
            smaller2 = num2;
        }

        for (int i = 3; i <= number; i++) { //i = 3 porque ja foi lido dois numeros fora do loop
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

        if (bigger1 == smaller1) { //se maior1 for igual a menor1 (ex.: maior é 7 e menor tambem é 7), sao iguais
            System.out.print("All the numbers are equal.");
        } else {
            System.out.printf("Two biggest: %d e %d.", bigger1, bigger2);
            System.out.printf("\nTwo smallest: %d e %d.", smaller1, smaller2);
        }
        sc.close();
    }
}
