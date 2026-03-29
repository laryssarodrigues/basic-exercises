//program that reads numbers of size 11 or 14 and formats them into CPF or CNPJ formats.

package br.com.exercises;

import java.util.Scanner;

public class Ex31CpfCnpjFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number with a length of 11 or 14: ");
        String number = sc.nextLine();

        String part1, part2, part3, part4, end;
        if (number.length() != 11 && number.length() != 14) {
            System.out.print("Invalid value!");

        } else {

            if (number.length() == 11) { //se tiver tamanho 11 = CPF
                part1 = number.substring(0, 3); //.substring(inicio, fim) -> inicio = onde começa & fim = onde para, excluindo-o
                part2 = number.substring(3, 6);
                part3 = number.substring(6,9); //3 caracteres (6,7,8)
                end = number.substring(9, 11);
                System.out.printf("CPF: %s.%s.%s-%s", part1, part2, part3, end);
            } else { //se nao for tamanho 11, o tamanho é 14
                part1 = number.substring(0, 2);
                part2 = number.substring(2,5);
                part3 = number.substring(5, 8);
                part4 = number.substring(8, 12);
                end = number.substring(12, 14);
                System.out.printf("CNPJ: %s.%s.%s/%s-%s", part1, part2, part3, part4, end);
            }
        }
        sc.close();
    }
}
