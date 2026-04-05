/* reads N tasks and prints them reversed order
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 02/04/26
 */

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex39ATaskListOrder {
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

        System.out.println(">>> LIST IN REVERSE ORDER <<<");
        int counter = 1;
        for (int j = tasks.length - 1; j >= 0; j--) {
            System.out.println(counter + ". " + tasks[j]);
            counter++;
        }
        sc.close();
    }
}
