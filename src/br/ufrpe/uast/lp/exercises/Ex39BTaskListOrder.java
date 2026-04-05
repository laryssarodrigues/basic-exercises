/* reads N tasks and prints them in random order
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 03/04/26
*/

package br.ufrpe.uast.lp.exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex39BTaskListOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int number = sc.nextInt();
        sc.nextLine();
        String[] tasks = new String[number];

        for (int i = 0; i < tasks.length; i++) {
            System.out.print("Enter the task: ");
            String task = sc.nextLine().toLowerCase();
            tasks[i] = task;
        }

        Random random = new Random();
        for (int j = tasks.length - 1; j > 0; j--) {
            int z = random.nextInt(j+1); //indice aleatorio entre 0 e j
            String originalValue = tasks[j]; //guarda valor original de tasks[j]
            tasks[j] = tasks[z];
            tasks[z] = originalValue; //recebe valor guardado em originalValue
        }

        System.out.println(">>> LIST IN RANDOM ORDER <<<");
        for (int k = 0; k < tasks.length; k++) {
            System.out.println((k + 1) + ". " + tasks[k]);
        }
        sc.close();
    }
}
