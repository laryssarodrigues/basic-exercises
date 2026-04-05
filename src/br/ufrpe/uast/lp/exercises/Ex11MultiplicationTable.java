/* program that reads an integer N and displays the multiplication table from 1 to N, using nested for loops.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 31/03/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex11MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        //do-while -> executa pelo menos uma vez e depois verifica a condiçao
        do { //entrada e validaçao (mensagem erro)
            System.out.print("Enter an integer: ");
            number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Invalid value! Please enter a number greater than 0.");
            }
        } while (number <= 0); //verifica se precisa repetir

        //loop externo: escolhe o numero
        //loop interno: calcula sua tabuada
        for (int i = 1; i <= number; i++) { //define ate qual numero a tabuada sera mostrada
            System.out.printf(">> Multiplication table of %d: ", i);

            for (int j = 1; j <= 10; j++) { //pega o numero e calcula sua tabuada
                int multiplication =  i * j;
                System.out.printf("| %d x %d = %d | ", i, j, multiplication);
            }
            System.out.println(); //pula a proxima linha para separar as tabuadas
        }
        sc.close();
    }
}
