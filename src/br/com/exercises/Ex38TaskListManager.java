//reads N tasks and prints them numbered in input order

package br.com.exercises;

import java.util.Scanner;

public class Ex38TaskListManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantidade de linhas: ");
        int number = sc.nextInt(); //pega so o numero digitado
        sc.nextLine(); //consome quebra de linha pendente (Enter)
        String[] tarefas = new String[number];

        for (int i = 0; i < tarefas.length; i++) {
            System.out.print("Enter the task: ");
            String task = sc.nextLine().toLowerCase();
            tarefas[i] = task;
            }

        System.out.println(">>> LISTA EM ORDEM NUMERADA <<<");
        for (int j = 0; j < tarefas.length; j++) {
            System.out.println((j + 1) + ". " + tarefas[j]);
        }
        sc.close();
    }
}
