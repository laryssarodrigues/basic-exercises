//reads N tasks and prints them numbered in input order

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex38TaskListManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int number = sc.nextInt(); //pega so o numero digitado
        sc.nextLine(); //consome quebra de linha pendente (Enter)
        String[] tasks = new String[number];

        for (int i = 0; i < tasks.length; i++) {
            System.out.print("Enter the task: ");
            String task = sc.nextLine().toLowerCase();
            tasks[i] = task;
            }

        System.out.println(">>> LIST IN NUMERICAL ORDER <<<");
        for (int j = 0; j < tasks.length; j++) {
            System.out.println((j + 1) + ". " + tasks[j]);
        }
        sc.close();
    }
}
