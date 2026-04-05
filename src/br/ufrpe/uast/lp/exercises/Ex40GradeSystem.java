/* reads 3 grades, calculates partial/final averages, and determines the student's final status.
Feito por: Laryssa Rodrigues
Turma: LP 2026.1
Data: 04/04/26
*/

package br.ufrpe.uast.lp.exercises;

import java.util.Scanner;

public class Ex40GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== GRADING SYSTEM ===");

        System.out.print("Enter first note: ");
        double note1 = sc.nextDouble();

        System.out.print("Enter second note: ");
        double note2 = sc.nextDouble();

        System.out.print("Enter third note: ");
        double note3 = sc.nextDouble();

        double partialAverage;
        double finalAverage;

        if ((note1 >= note2) && (note1 >= note3)) {
            if (note2 >= note3) {
                partialAverage = (note1 + note2) / 2;
            } else {
                partialAverage = (note1 + note3) / 2;
            }

        } else if ((note2 >= note1) && (note2 >= note3)) {
            if (note1 >= note3) {
                partialAverage = (note2 + note1) / 2;
            } else {
                partialAverage = (note2 + note3) / 2;
            }

        } else {
            if (note1 >= note2) {
                partialAverage = (note3 + note1) / 2;
            } else {
                partialAverage = (note3 + note2) / 2;
            }
        }

        System.out.println("<< STUDENT'S FINAL SITUATION >>");

        if (partialAverage >= 7) {
            finalAverage = partialAverage;
            System.out.printf("Partial average: %.1f%n", partialAverage);
            System.out.printf("Final average: %.1f%n", finalAverage);
            System.out.println("PASSED BY AVERAGE!");

        } else if (partialAverage < 3){
            finalAverage = partialAverage;
            System.out.printf("Partial average: %.1f%n", partialAverage);
            System.out.printf("Final average: %.1f%n", finalAverage);
            System.out.println("FAILED!");

        } else { //3 <= partialAverage < 7
            System.out.printf("Partial average: %.1f%n", partialAverage);
            System.out.println("IN PROGRESS!");
            System.out.print("Final exam grade: ");
            double noteFT = sc.nextDouble();
            finalAverage = (partialAverage + noteFT) / 2;
            System.out.printf("Final average: %.1f%n", finalAverage);

            if (finalAverage >= 5) {
                System.out.println("PASSED!");
            } else {
                System.out.println("FAILED!");
            }
        }
        sc.close();
    }
}
